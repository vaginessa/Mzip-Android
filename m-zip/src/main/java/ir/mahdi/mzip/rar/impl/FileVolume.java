/*
 * This file is part of seedbox <github.com/seedbox>.
 *
 * seedbox is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * seedbox is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with seedbox.  If not, see <http://www.gnu.org/licenses/>.
 */
package ir.mahdi.mzip.rar.impl;

import java.io.File;
import java.io.IOException;

import ir.mahdi.mzip.rar.Archive;
import ir.mahdi.mzip.rar.Volume;
import ir.mahdi.mzip.rar.io.IReadOnlyAccess;
import ir.mahdi.mzip.rar.io.ReadOnlyAccessFile;


public class FileVolume implements Volume {
    private final Archive archive;
    private final File file;

    public FileVolume(Archive archive, File file) {
        this.archive = archive;
        this.file = file;
    }

    @Override
    public IReadOnlyAccess getReadOnlyAccess() throws IOException {
        return new ReadOnlyAccessFile(file);
    }

    @Override
    public long getLength() {
        return file.length();
    }

    @Override
    public Archive getArchive() {
        return archive;
    }

    public File getFile() {
        return file;
    }
}
