package p220r9;

import P8.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.voltasit.obdeleven.Application;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import p279w9.b;

/* JADX INFO: compiled from: IOUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x {
    public static File a(Context context, String str, boolean z10) {
        File file = new File(context.getExternalFilesDir(null), "history.txt");
        if (!file.exists() && file.getParentFile().mkdirs()) {
            try {
                if (!file.createNewFile()) {
                    return null;
                }
            } catch (IOException e10) {
                b bVar = Application.f29634b;
                c.b(e10);
                return null;
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file, z10);
            try {
                fileWriter.write(str);
                fileWriter.flush();
                fileWriter.close();
                return file;
            } catch (Throwable th) {
                try {
                    fileWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e11) {
            b bVar2 = Application.f29634b;
            c.b(e11);
            return null;
        }
    }

    public static Bitmap b(String str) {
        Paint paint = new Paint(1);
        paint.setTextSize(40);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.LEFT);
        float f10 = -paint.ascent();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (paint.measureText(str) + 0.0f), (int) (paint.descent() + f10 + 0.0f), Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawText(str, 0.0f, f10, paint);
        return bitmapCreateBitmap;
    }
}
