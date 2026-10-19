package androidx.core.app;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class s extends B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IconCompat f16782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f16783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16785d;

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    public static IconCompat a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.b((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.c((Bitmap) parcelable);
        }
        return null;
    }

    @Override // androidx.core.app.B
    public final void apply(o oVar) {
        Bitmap bitmap;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((C) oVar).f16678b).setBigContentTitle(this.mBigContentTitle);
        IconCompat iconCompat = this.f16782a;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat, oVar instanceof C ? ((C) oVar).f16677a : null));
            } else {
                int iC = iconCompat.f16834a;
                if (iC == -1) {
                    iC = IconCompat.a.c(iconCompat.f16835b);
                }
                if (iC == 1) {
                    IconCompat iconCompat2 = this.f16782a;
                    int i10 = iconCompat2.f16834a;
                    if (i10 == -1) {
                        Object obj = iconCompat2.f16835b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i10 == 1) {
                        bitmap = (Bitmap) iconCompat2.f16835b;
                    } else {
                        if (i10 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f16835b;
                        int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        float f10 = iMin;
                        float f11 = 0.5f * f10;
                        float f12 = 0.9166667f * f11;
                        float f13 = 0.010416667f * f10;
                        paint.setColor(0);
                        paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f11, f11, f12, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - iMin)) / 2.0f, (-(bitmap2.getHeight() - iMin)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f11, f11, f12, paint);
                        canvas.setBitmap(null);
                        bitmap = bitmapCreateBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
        }
        if (this.f16784c) {
            IconCompat iconCompat3 = this.f16783b;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                a.a(bigContentTitle, IconCompat.a.f(iconCompat3, oVar instanceof C ? ((C) oVar).f16677a : null));
            }
        }
        if (this.mSummaryTextSet) {
            bigContentTitle.setSummaryText(this.mSummaryText);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            b.c(bigContentTitle, this.f16785d);
            b.b(bigContentTitle, null);
        }
    }

    public final void b(CharSequence charSequence) {
        this.mBigContentTitle = v.b(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.mSummaryText = v.b(charSequence);
        this.mSummaryTextSet = true;
    }

    @Override // androidx.core.app.B
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // androidx.core.app.B
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // androidx.core.app.B
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f16783b = a(bundle.getParcelable("android.largeIcon.big"));
            this.f16784c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.f16782a = parcelable != null ? a(parcelable) : a(bundle.getParcelable("android.pictureIcon"));
        this.f16785d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }
}
