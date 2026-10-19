package p177o3;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import java.io.IOException;
import p079g3.p;
import p214r3.c;
import p214r3.g;

/* JADX INFO: compiled from: ImageLayer.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p092h3.a f45186C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f45187D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f45188E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p f45189F;

    public b(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.f45186C = new p092h3.a(3);
        this.f45187D = new Rect();
        this.f45188E = new Rect();
        p079g3.b bVar = lottieDrawable.f23312b;
        this.f45189F = bVar == null ? null : (p) bVar.f35555d.get(layer.f23450g);
    }

    @Override // com.airbnb.lottie.model.layer.a, p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        p pVar = this.f45189F;
        if (pVar != null) {
            float fC = g.c();
            rectF.set(0.0f, 0.0f, pVar.f35587a * fC, pVar.f35588b * fC);
            this.f23488n.mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x012a  */
    @Override // com.airbnb.lottie.model.layer.a
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmapE;
        LottieDrawable lottieDrawable = this.f23489o;
        p pVar = this.f45189F;
        String str = this.f23490p.f23450g;
        p129k3.b bVar = lottieDrawable.f23317g;
        Bitmap bitmap = null;
        if (bVar != null) {
            Drawable.Callback callback = lottieDrawable.getCallback();
            Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
            Context context2 = bVar.f41581a;
            if (context2 instanceof Application) {
                context = context.getApplicationContext();
            }
            if (context != context2) {
                lottieDrawable.f23317g = null;
            }
        }
        if (lottieDrawable.f23317g == null) {
            lottieDrawable.f23317g = new p129k3.b(lottieDrawable.getCallback(), lottieDrawable.f23312b.f35555d);
        }
        p129k3.b bVar2 = lottieDrawable.f23317g;
        if (bVar2 != null) {
            String str2 = bVar2.f41582b;
            p pVar2 = (p) bVar2.f41583c.get(str);
            if (pVar2 != null) {
                bitmapE = pVar2.f35590d;
                if (bitmapE == null) {
                    Context context3 = bVar2.f41581a;
                    if (context3 == null) {
                        bitmapE = null;
                    } else {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        String str3 = pVar2.f35589c;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context3.getAssets().open(str2 + str3), null, options);
                                    if (bitmapDecodeStream == null) {
                                        c.b("Decoded image `" + str + "` is null.");
                                        bitmapE = null;
                                    } else {
                                        bitmapE = g.e(bitmapDecodeStream, pVar2.f35587a, pVar2.f35588b);
                                        synchronized (p129k3.b.f41580d) {
                                            ((p) bVar2.f41583c.get(str)).f35590d = bitmapE;
                                        }
                                    }
                                } catch (IllegalArgumentException e10) {
                                    c.c("Unable to decode image `" + str + "`.", e10);
                                }
                            } catch (IOException e11) {
                                c.c("Unable to open asset.", e11);
                            }
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                bitmapE = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                synchronized (p129k3.b.f41580d) {
                                    ((p) bVar2.f41583c.get(str)).f35590d = bitmapE;
                                }
                            } catch (IllegalArgumentException e12) {
                                c.c("data URL did not have correct base64 format.", e12);
                                bitmapE = null;
                            }
                        }
                    }
                }
            } else {
                bitmapE = null;
            }
        } else {
            bitmapE = null;
        }
        if (bitmapE != null) {
            bitmap = bitmapE;
        } else if (pVar != null) {
            bitmap = pVar.f35590d;
        }
        if (bitmap == null || bitmap.isRecycled() || pVar == null) {
            return;
        }
        float fC = g.c();
        p092h3.a aVar = this.f45186C;
        aVar.setAlpha(i10);
        canvas.save();
        canvas.concat(matrix);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Rect rect = this.f45187D;
        rect.set(0, 0, width, height);
        boolean z10 = lottieDrawable.f23320k;
        Rect rect2 = this.f45188E;
        if (z10) {
            rect2.set(0, 0, (int) (pVar.f35587a * fC), (int) (pVar.f35588b * fC));
        } else {
            rect2.set(0, 0, (int) (bitmap.getWidth() * fC), (int) (bitmap.getHeight() * fC));
        }
        canvas.drawBitmap(bitmap, rect, rect2, aVar);
        canvas.restore();
    }
}
