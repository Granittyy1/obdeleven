package io.intercom.android.sdk.lightcompressor.utils;

import android.util.Log;
import io.intercom.android.sdk.lightcompressor.data.AtomsKt;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.i;
import p293xa.r;

/* JADX INFO: compiled from: StreamableVideo.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class StreamableVideo {
    private static final int ATOM_PREAMBLE_SIZE = 8;
    public static final StreamableVideo INSTANCE = new StreamableVideo();
    private static final String tag = "StreamableVideo";

    private StreamableVideo() {
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    private final boolean convert(FileChannel fileChannel, FileChannel fileChannel2) throws Exception {
        String str;
        int i10 = 8;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.BIG_ENDIAN);
        long jUInt32ToLong = 0;
        ByteBuffer byteBuffer = null;
        int i11 = 0;
        long jPosition = 0;
        do {
            i.b(byteBufferOrder);
            boolean andFill = readAndFill(fileChannel, byteBufferOrder);
            str = tag;
            if (!andFill) {
                break;
            }
            jUInt32ToLong = NumbersUtilsKt.uInt32ToLong(byteBufferOrder.getInt());
            i11 = byteBufferOrder.getInt();
            if (i11 == AtomsKt.getFTYP_ATOM()) {
                int iUInt32ToInt = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(iUInt32ToInt).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.rewind();
                byteBufferOrder2.put(byteBufferOrder);
                if (fileChannel.read(byteBufferOrder2) < iUInt32ToInt - 8) {
                    byteBuffer = byteBufferOrder2;
                    break;
                }
                byteBufferOrder2.flip();
                jPosition = fileChannel.position();
                r rVar = r.f47939a;
                byteBuffer = byteBufferOrder2;
                if (i11 == AtomsKt.getFREE_ATOM() && i11 != AtomsKt.getJUNK_ATOM() && i11 != AtomsKt.getMDAT_ATOM() && i11 != AtomsKt.getMOOV_ATOM() && i11 != AtomsKt.getPNOT_ATOM() && i11 != AtomsKt.getSKIP_ATOM() && i11 != AtomsKt.getWIDE_ATOM() && i11 != AtomsKt.getPICT_ATOM() && i11 != AtomsKt.getUUID_ATOM() && i11 != AtomsKt.getFTYP_ATOM()) {
                    Log.wtf(tag, "encountered non-QT top-level atom (is this a QuickTime file?)");
                    break;
                }
            } else {
                if (jUInt32ToLong == 1) {
                    byteBufferOrder.clear();
                    if (!readAndFill(fileChannel, byteBufferOrder)) {
                        break;
                    }
                    jUInt32ToLong = NumbersUtilsKt.uInt64ToLong(byteBufferOrder.getLong());
                    fileChannel.position((fileChannel.position() + jUInt32ToLong) - ((long) 16));
                } else {
                    fileChannel.position((fileChannel.position() + jUInt32ToLong) - ((long) 8));
                    jUInt32ToLong = jUInt32ToLong;
                }
                if (i11 == AtomsKt.getFREE_ATOM()) {
                }
            }
        } while (jUInt32ToLong >= 8);
        long j = jPosition;
        if (i11 != AtomsKt.getMOOV_ATOM()) {
            Log.wtf(tag, "last atom in file was not a moov atom");
            return false;
        }
        int iUInt32ToInt2 = NumbersUtilsKt.uInt32ToInt(jUInt32ToLong);
        long j10 = iUInt32ToInt2;
        long size = fileChannel.size() - j10;
        ByteBuffer byteBufferOrder3 = ByteBuffer.allocate(iUInt32ToInt2).order(ByteOrder.BIG_ENDIAN);
        if (!readAndFill(fileChannel, byteBufferOrder3, size)) {
            throw new Exception("failed to read moov atom");
        }
        if (byteBufferOrder3.getInt(12) == AtomsKt.getCMOV_ATOM()) {
            throw new Exception("this utility does not support compressed moov atoms yet");
        }
        while (byteBufferOrder3.remaining() >= i10) {
            int iPosition = byteBufferOrder3.position();
            int i12 = byteBufferOrder3.getInt(iPosition + 4);
            if (i12 == AtomsKt.getSTCO_ATOM() || i12 == AtomsKt.getCO64_ATOM()) {
                long j11 = size;
                if (NumbersUtilsKt.uInt32ToLong(byteBufferOrder3.getInt(iPosition)) > byteBufferOrder3.remaining()) {
                    throw new Exception("bad atom size");
                }
                byteBufferOrder3.position(iPosition + 12);
                if (byteBufferOrder3.remaining() < 4) {
                    throw new Exception("malformed atom");
                }
                int iUInt32ToInt3 = NumbersUtilsKt.uInt32ToInt(byteBufferOrder3.getInt());
                if (i12 == AtomsKt.getSTCO_ATOM()) {
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 4) {
                        throw new Exception("bad atom size/element count");
                    }
                    for (int i13 = 0; i13 < iUInt32ToInt3; i13++) {
                        int i14 = byteBufferOrder3.getInt(byteBufferOrder3.position());
                        int i15 = i14 + iUInt32ToInt2;
                        if (i14 < 0 && i15 >= 0) {
                            throw new Exception("This is bug in original qt-faststart.c: stco atom should be extended to co64 atom as new offset value overflows uint32, but is not implemented.");
                        }
                        byteBufferOrder3.putInt(i15);
                    }
                } else if (i12 == AtomsKt.getCO64_ATOM()) {
                    Log.wtf(str, "patching co64 atom...");
                    if (byteBufferOrder3.remaining() < iUInt32ToInt3 * 8) {
                        throw new Exception("bad atom size/element count");
                    }
                    int i16 = 0;
                    while (i16 < iUInt32ToInt3) {
                        byteBufferOrder3.putLong(byteBufferOrder3.getLong(byteBufferOrder3.position()) + j10);
                        i16++;
                        str = str;
                        iUInt32ToInt2 = iUInt32ToInt2;
                    }
                    i10 = 8;
                    size = j11;
                }
                size = j11;
            } else {
                byteBufferOrder3.position(byteBufferOrder3.position() + 1);
            }
            i10 = 8;
        }
        long j12 = size;
        fileChannel.position(j);
        if (byteBuffer != null) {
            byteBuffer.rewind();
            fileChannel2.write(byteBuffer);
        }
        byteBufferOrder3.rewind();
        fileChannel2.write(byteBufferOrder3);
        fileChannel.transferTo(j, j12 - j, fileChannel2);
        return true;
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer) throws IOException {
        byteBuffer.clear();
        int i10 = fileChannel.read(byteBuffer);
        byteBuffer.flip();
        return i10 == byteBuffer.capacity();
    }

    private final void safeClose(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.wtf(tag, "Failed to close file: ");
            }
        }
    }

    public final boolean start(File file, File out) throws Throwable {
        FileOutputStream fileOutputStream;
        i.e(out, "out");
        Closeable closeable = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                fileOutputStream = new FileOutputStream(out);
                try {
                    FileChannel channel2 = fileOutputStream.getChannel();
                    i.b(channel);
                    i.b(channel2);
                    boolean zConvert = convert(channel, channel2);
                    safeClose(fileInputStream);
                    safeClose(fileOutputStream);
                    if (!zConvert) {
                        out.delete();
                    }
                    return zConvert;
                } catch (Throwable th) {
                    th = th;
                    closeable = fileInputStream;
                    safeClose(closeable);
                    safeClose(fileOutputStream);
                    out.delete();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private final boolean readAndFill(FileChannel fileChannel, ByteBuffer byteBuffer, long j) throws IOException {
        byteBuffer.clear();
        int i10 = fileChannel.read(byteBuffer, j);
        byteBuffer.flip();
        return i10 == byteBuffer.capacity();
    }
}
