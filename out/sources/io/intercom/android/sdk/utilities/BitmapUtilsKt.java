package io.intercom.android.sdk.utilities;

import U0.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: BitmapUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BitmapUtilsKt {
    public static final int calculateInSampleSize(BitmapFactory.Options options, int i10, int i11) {
        i.e(options, "options");
        Pair pair = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pair.a()).intValue();
        int iIntValue2 = ((Number) pair.b()).intValue();
        int i12 = 1;
        if (iIntValue > i11 || iIntValue2 > i10) {
            int i13 = iIntValue / 2;
            int i14 = iIntValue2 / 2;
            while (i13 / i12 >= i11 && i14 / i12 >= i10) {
                i12 *= 2;
            }
        }
        return i12;
    }

    public static final Bitmap determineBitmapRotation(Context context, Uri uri, Bitmap bitmap) throws IOException {
        i.e(context, "context");
        i.e(uri, "uri");
        i.e(bitmap, "bitmap");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            int iC = new a(inputStreamOpenInputStream).c(0, "Orientation");
            Matrix matrix = new Matrix();
            if (iC == 3) {
                matrix.postRotate(180.0f);
            } else if (iC == 6) {
                matrix.postRotate(90.0f);
            } else if (iC == 8) {
                matrix.postRotate(270.0f);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (bitmapCreateBitmap != null) {
                bitmap = bitmapCreateBitmap;
            }
        }
        if (inputStreamOpenInputStream != null) {
            inputStreamOpenInputStream.close();
        }
        return bitmap;
    }

    public static final Bitmap drawableToBitmap(Drawable drawable, int i10, int i11) {
        Bitmap bitmapCreateBitmap;
        i.e(drawable, "drawable");
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                i.d(bitmap, "getBitmap(...)");
                return bitmap;
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            i.b(bitmapCreateBitmap);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            i.b(bitmapCreateBitmap);
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
