/*
 * Copyright (c) 2007 innoSysTec (R) GmbH, Germany. All rights reserved.
 * Original author: Edmund Wagner
 * Creation date: 31.05.2007
 *
 * Source: $HeadURL$
 * Last changed: $LastChangedDate$
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
package ir.mahdi.mzip.rar.unpack.vm;

public enum VMFlags {
    VM_FC(1),
    VM_FZ(2),
    VM_FS(0x80000000);

    private int flag;

    VMFlags(int flag) {
        this.flag = flag;
    }

    public static VMFlags findFlag(int flag) {
        if (VM_FC.equals(flag)) {
            return VM_FC;
        }
        if (VM_FS.equals(flag)) {
            return VM_FS;
        }
        if (VM_FZ.equals(flag)) {
            return VM_FZ;
        }
        return null;
    }

    public boolean equals(int flag) {
        return this.flag == flag;
    }

    public int getFlag() {
        return flag;
    }

}
