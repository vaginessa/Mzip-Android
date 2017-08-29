package ir.mahdi.mzip.rar.io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;


public class InputStreamReadOnlyAccessFile implements IReadOnlyAccess {
    private RandomAccessStream is;

    public InputStreamReadOnlyAccessFile(final InputStream is) {
        this.is = new RandomAccessStream(new BufferedInputStream(is));
    }

    @Override
    public long getPosition() throws IOException {
        return is.getLongFilePointer();
    }

    @Override
    public void setPosition(long pos) throws IOException {
        is.seek(pos);
    }

    @Override
    public int read() throws IOException {
        return is.read();
    }

    @Override
    public int read(byte[] buffer, int off, int count) throws IOException {
        return is.read(buffer, off, count);
    }

    @Override
    public int readFully(byte[] buffer, int count) throws IOException {
        is.readFully(buffer, count);
        return count;
    }

    @Override
    public void close() throws IOException {
        is.close();
    }

}
