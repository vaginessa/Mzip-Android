/*
 * Copyright (c) 2007 innoSysTec (R) GmbH, Germany. All rights reserved.
 * Original author: Edmund Wagner
 * Creation date: 01.06.2007
 *
 * Source: $HeadURL$
 * Last changed: $LastChangedDate$
 * 
 * Here some html entities which can be used for escaping javadoc tags:
 * "&":  "&#038;" or "&amp;"
 * "<":  "&#060;" or "&lt;"
 * ">":  "&#062;" or "&gt;"
 * "@":  "&#064;" 
 */
package ir.mahdi.mzip.rar.unpack.decode;

public enum CodeType {
    CODE_HUFFMAN, CODE_LZ, CODE_LZ2, CODE_REPEATLZ, CODE_CACHELZ,
    CODE_STARTFILE, CODE_ENDFILE, CODE_VM, CODE_VMDATA
}
