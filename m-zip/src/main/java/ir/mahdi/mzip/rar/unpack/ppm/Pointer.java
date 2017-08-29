/*
 * Copyright (c) 2007 innoSysTec (R) GmbH, Germany. All rights reserved.
 * Original author: Edmund Wagner
 * Creation date: 14.06.2007
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
package ir.mahdi.mzip.rar.unpack.ppm;

public abstract class Pointer {
    protected byte[] mem;
    protected int pos;

    public Pointer(byte[] mem) {
        this.mem = mem;
    }

    public int getAddress() {
        assert (mem != null);
        return pos;
    }

    public void setAddress(int pos) {
        assert (mem != null);
        assert (pos >= 0) && (pos < mem.length) : pos;
        this.pos = pos;
    }
}
