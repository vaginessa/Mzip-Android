/*
 * Copyright (c) 2007 innoSysTec (R) GmbH, Germany. All rights reserved.
 * Original author: Edmund Wagner
 * Creation date: 22.05.2007
 *
 * Source: $HeadURL$
 * Last changed: $LastChangedDate$
 * 
 * 
 * the unrar licence applies to all junrar source and binary distributions 
 * you are not allowed to use this source to re-create the RAR compression algorithm
 *
 * Here some html entities which can be used for escaping javadoc tags:
 * "&":  "&#038;" or "&amp;"
 * "<":  "&#060;" or "&lt;"
 * ">":  "&#062;" or "&gt;"
 * "@":  "&#064;" 
 */
package ir.mahdi.mzip.rar.rarfile;


import ir.mahdi.mzip.rar.io.Raw;


public class MainHeader extends BaseBlock {
    public static final short mainHeaderSizeWithEnc = 7;
    public static final short mainHeaderSize = 6;
    private short highPosAv;
    private int posAv;
    private byte encryptVersion;

    public MainHeader(BaseBlock bb, byte[] mainHeader) {
        super(bb);
        int pos = 0;
        highPosAv = Raw.readShortLittleEndian(mainHeader, pos);
        pos += 2;
        posAv = Raw.readIntLittleEndian(mainHeader, pos);
        pos += 4;

        if (hasEncryptVersion()) {
            encryptVersion |= mainHeader[pos] & 0xff;
        }
    }

    public boolean hasArchCmt() {
        return (this.flags & BaseBlock.MHD_COMMENT) != 0;
    }

    public byte getEncryptVersion() {
        return encryptVersion;
    }

    public short getHighPosAv() {
        return highPosAv;
    }

    public int getPosAv() {
        return posAv;
    }

    public boolean isEncrypted() {
        return (this.flags & BaseBlock.MHD_PASSWORD) != 0;
    }

    public boolean isMultiVolume() {
        return (this.flags & BaseBlock.MHD_VOLUME) != 0;
    }

    public boolean isFirstVolume() {
        return (this.flags & BaseBlock.MHD_FIRSTVOLUME) != 0;
    }

    public void print() {
        super.print();
        StringBuilder str = new StringBuilder();
        str.append("posav: " + getPosAv());
        str.append("\nhighposav: " + getHighPosAv());
        str.append("\nhasencversion: " + hasEncryptVersion() + (hasEncryptVersion() ? getEncryptVersion() : ""));
        str.append("\nhasarchcmt: " + hasArchCmt());
        str.append("\nisEncrypted: " + isEncrypted());
        str.append("\nisMultivolume: " + isMultiVolume());
        str.append("\nisFirstvolume: " + isFirstVolume());
        str.append("\nisSolid: " + isSolid());
        str.append("\nisLocked: " + isLocked());
        str.append("\nisProtected: " + isProtected());
        str.append("\nisAV: " + isAV());
    }

    public boolean isSolid() {
        return (this.flags & MHD_SOLID) != 0;
    }

    public boolean isLocked() {
        return (this.flags & MHD_LOCK) != 0;
    }

    public boolean isProtected() {
        return (this.flags & MHD_PROTECT) != 0;
    }

    public boolean isAV() {
        return (this.flags & MHD_AV) != 0;
    }

    public boolean isNewNumbering() {
        return (this.flags & MHD_NEWNUMBERING) != 0;
    }
}
