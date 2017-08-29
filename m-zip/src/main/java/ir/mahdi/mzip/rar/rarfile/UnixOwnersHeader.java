package ir.mahdi.mzip.rar.rarfile;


import ir.mahdi.mzip.rar.io.Raw;


public class UnixOwnersHeader
        extends SubBlockHeader {
    private int ownerNameSize;
    private int groupNameSize;
    private String owner;
    private String group;

    public UnixOwnersHeader(SubBlockHeader sb, byte[] uoHeader) {
        super(sb);
        int pos = 0;
        ownerNameSize = Raw.readShortLittleEndian(uoHeader, pos) & 0xFFFF;
        pos += 2;
        groupNameSize = Raw.readShortLittleEndian(uoHeader, pos) & 0xFFFF;
        pos += 2;
        if (pos + ownerNameSize < uoHeader.length) {
            byte[] ownerBuffer = new byte[ownerNameSize];
            System.arraycopy(uoHeader, pos, ownerBuffer, 0, ownerNameSize);
            owner = new String(ownerBuffer);
        }
        pos += ownerNameSize;
        if (pos + groupNameSize < uoHeader.length) {
            byte[] groupBuffer = new byte[groupNameSize];
            System.arraycopy(uoHeader, pos, groupBuffer, 0, groupNameSize);
            group = new String(groupBuffer);
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getGroupNameSize() {
        return groupNameSize;
    }

    public void setGroupNameSize(int groupNameSize) {
        this.groupNameSize = groupNameSize;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getOwnerNameSize() {
        return ownerNameSize;
    }

    public void setOwnerNameSize(int ownerNameSize) {
        this.ownerNameSize = ownerNameSize;
    }

    /* (non-Javadoc)
     * @see de.innosystec.unrar.rarfile.SubBlockHeader#print()
     */
    public void print() {
        super.print();
    }
}
