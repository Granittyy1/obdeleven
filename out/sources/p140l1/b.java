package p140l1;

import U0.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.media3.common.ParserException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: BitmapUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static Bitmap a(int i10, byte[] bArr) throws IOException {
        int i11 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, null);
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            a aVar = new a(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (aVar.c(1, "Orientation")) {
                case 3:
                case 4:
                    i11 = 180;
                    break;
                case 5:
                case 8:
                    i11 = 270;
                    break;
                case 6:
                case 7:
                    i11 = 90;
                    break;
            }
            if (i11 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i11);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
