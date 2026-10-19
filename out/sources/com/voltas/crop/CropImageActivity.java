package com.voltas.crop;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.domain.usecases.device.u;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class CropImageActivity extends f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f29564r = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f29565c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29568f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29571i;
    public Uri j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f29572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f29573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p278w8.f f29575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CropImageView f29576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HighlightView f29577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29578q;

    public class a {
        public a() {
        }
    }

    public final int a(Uri uri) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i10 = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                d.a(inputStreamOpenInputStream);
                int[] iArr = new int[1];
                GLES10.glGetIntegerv(3379, iArr, 0);
                int i11 = iArr[0];
                int iMin = i11 == 0 ? 2048 : Math.min(i11, 4096);
                while (true) {
                    if (options.outHeight / i10 <= iMin && options.outWidth / i10 <= iMin) {
                        return i10;
                    }
                    i10 <<= 1;
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                d.a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.Closeable] */
    public final Bitmap b(Rect rect, int i10, int i11) throws Throwable {
        InputStream inputStream;
        Bitmap bitmap;
        Rect rect2;
        Bitmap bitmapDecodeRegion;
        Bitmap bitmap2;
        CropImageView cropImageView = this.f29576o;
        cropImageView.getClass();
        ?? r10 = 0;
        cropImageView.e(new p278w8.f(null, 0));
        p278w8.f fVar = this.f29575n;
        if (fVar != null && (bitmap2 = fVar.f47804a) != null) {
            bitmap2.recycle();
            fVar.f47804a = null;
        }
        System.gc();
        try {
            try {
                InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(this.j);
                try {
                    try {
                        BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                        int width = bitmapRegionDecoderNewInstance.getWidth();
                        int height = bitmapRegionDecoderNewInstance.getHeight();
                        if (this.f29570h != 0) {
                            Matrix matrix = new Matrix();
                            matrix.setRotate(-this.f29570h);
                            RectF rectF = new RectF();
                            matrix.mapRect(rectF, new RectF(rect));
                            rectF.offset(rectF.left < 0.0f ? width : 0.0f, rectF.top < 0.0f ? height : 0.0f);
                            rect2 = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        } else {
                            rect2 = rect;
                        }
                        try {
                            bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect2, new BitmapFactory.Options());
                            if (bitmapDecodeRegion != null) {
                                try {
                                    try {
                                        if (rect2.width() > i10 || rect2.height() > i11) {
                                            Matrix matrix2 = new Matrix();
                                            matrix2.postScale(i10 / rect2.width(), i11 / rect2.height());
                                            bitmapDecodeRegion = Bitmap.createBitmap(bitmapDecodeRegion, 0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight(), matrix2, true);
                                        }
                                    } catch (IllegalArgumentException e10) {
                                        e = e10;
                                        throw new IllegalArgumentException("Rectangle " + rect2 + " is outside of the image (" + width + "," + height + "," + this.f29570h + ")", e);
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    bitmap = bitmapDecodeRegion;
                                    inputStream = inputStreamOpenInputStream;
                                    u.h("Error cropping image: " + e.getMessage(), e);
                                    c(e);
                                    d.a(inputStream);
                                    r10 = bitmap;
                                    return r10;
                                } catch (OutOfMemoryError e12) {
                                    e = e12;
                                    bitmap = bitmapDecodeRegion;
                                    inputStream = inputStreamOpenInputStream;
                                    u.h("OOM cropping image: " + e.getMessage(), e);
                                    c(e);
                                    d.a(inputStream);
                                    r10 = bitmap;
                                    return r10;
                                }
                            }
                            d.a(inputStreamOpenInputStream);
                            return bitmapDecodeRegion;
                        } catch (IllegalArgumentException e13) {
                            e = e13;
                            bitmapDecodeRegion = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r10 = inputStreamOpenInputStream;
                        d.a(r10);
                        throw th;
                    }
                } catch (IOException e14) {
                    e = e14;
                    inputStream = inputStreamOpenInputStream;
                    bitmap = null;
                    u.h("Error cropping image: " + e.getMessage(), e);
                    c(e);
                    d.a(inputStream);
                    r10 = bitmap;
                    return r10;
                } catch (OutOfMemoryError e15) {
                    e = e15;
                    inputStream = inputStreamOpenInputStream;
                    bitmap = null;
                    u.h("OOM cropping image: " + e.getMessage(), e);
                    c(e);
                    d.a(inputStream);
                    r10 = bitmap;
                    return r10;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e16) {
            e = e16;
            inputStream = null;
        } catch (OutOfMemoryError e17) {
            e = e17;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r10 = 0;
        }
    }

    public final void c(Throwable th) {
        setResult(404, new Intent().putExtra("error", th));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00e1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // com.voltas.crop.f, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        ?? r10;
        InputStream inputStreamOpenInputStream;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().clearFlags(67108864);
        setContentView(R.layout.crop__activity_crop);
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
        B1.a aVar = new B1.a(8);
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        O.d.u(viewGroup, aVar);
        CropImageView cropImageView = (CropImageView) findViewById(R.id.crop_image);
        this.f29576o = cropImageView;
        cropImageView.setMultiOrientationEnabled(this.f29578q);
        CropImageView cropImageView2 = this.f29576o;
        cropImageView2.f29582o = this;
        cropImageView2.setRecycler(new com.voltas.crop.a());
        findViewById(R.id.btn_cancel).setOnClickListener(new p278w8.a(this));
        findViewById(R.id.btn_done).setOnClickListener(new p278w8.b(this));
        if (getIntent() != null && getIntent().getExtras() != null) {
            this.f29578q = getIntent().getExtras().getBoolean("multi_orientation");
        }
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.f29566d = extras.getInt("aspect_x");
            this.f29567e = extras.getInt("aspect_y");
            this.f29568f = extras.getInt("max_x");
            this.f29569g = extras.getInt("max_y");
            this.f29571i = extras.getBoolean("as_png", false);
            this.f29572k = (Uri) extras.getParcelable("output");
        }
        Uri data = intent.getData();
        this.j = data;
        ?? r11 = 0;
        if (data != null) {
            File fileB = d.b(this, getContentResolver(), this.j);
            if (fileB == null) {
                r10 = 0;
            } else {
                try {
                    int attributeInt = new ExifInterface(fileB.getAbsolutePath()).getAttributeInt("Orientation", 0);
                    if (attributeInt == 3) {
                        r10 = 180;
                    } else if (attributeInt == 6) {
                        r10 = 90;
                    } else if (attributeInt != 8) {
                        r10 = 0;
                    } else {
                        r10 = 270;
                    }
                } catch (IOException e10) {
                    u.h("Error getting Exif data", e10);
                }
            }
            this.f29570h = r10;
            try {
                try {
                    this.f29574m = a(this.j);
                    inputStreamOpenInputStream = getContentResolver().openInputStream(this.j);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inSampleSize = this.f29574m;
                        this.f29575n = new p278w8.f(BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options), this.f29570h);
                        r10 = inputStreamOpenInputStream;
                    } catch (IOException e11) {
                        e = e11;
                        u.h("Error reading image: " + e.getMessage(), e);
                        c(e);
                        r10 = inputStreamOpenInputStream;
                    } catch (OutOfMemoryError e12) {
                        e = e12;
                        u.h("OOM reading image: " + e.getMessage(), e);
                        c(e);
                        r10 = inputStreamOpenInputStream;
                    }
                } catch (Throwable th) {
                    th = th;
                    r11 = r10;
                    d.a(r11);
                    throw th;
                }
            } catch (IOException e13) {
                e = e13;
                inputStreamOpenInputStream = null;
            } catch (OutOfMemoryError e14) {
                e = e14;
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                d.a(r11);
                throw th;
            }
            d.a(r10);
        }
        if (this.f29575n == null) {
            finish();
            return;
        }
        if (isFinishing()) {
            return;
        }
        this.f29576o.e(this.f29575n);
        new Thread(new d.a(this, new b(this), ProgressDialog.show(this, null, getResources().getString(R.string.crop__wait), true, false), this.f29565c)).start();
    }

    @Override // com.voltas.crop.f, android.app.Activity
    public final void onDestroy() {
        Bitmap bitmap;
        super.onDestroy();
        p278w8.f fVar = this.f29575n;
        if (fVar == null || (bitmap = fVar.f47804a) == null) {
            return;
        }
        bitmap.recycle();
        fVar.f47804a = null;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }
}
