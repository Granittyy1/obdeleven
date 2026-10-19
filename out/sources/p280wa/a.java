package p280wa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.Allocation;
import android.renderscript.BaseObj;
import android.renderscript.Element;
import android.renderscript.RSRuntimeException;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: Blur.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static Bitmap a(Context context, Bitmap bitmap, b bVar) throws Throwable {
        int i10 = bVar.f47832a;
        int i11 = bVar.f47833b;
        int[] iArr = {i10, i11};
        int i12 = 0;
        while (true) {
            Bitmap bitmap2 = null;
            if (i12 >= 2) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f10 = 1.0f / 1;
                canvas.scale(f10, f10);
                Paint paint = new Paint();
                paint.setFlags(3);
                paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                try {
                    b(context, bitmapCreateBitmap, bVar.f47834c);
                    return bitmapCreateBitmap;
                } catch (RSRuntimeException unused) {
                    int i13 = bVar.f47834c;
                    if (i13 >= 1) {
                        int width = bitmapCreateBitmap.getWidth();
                        int height = bitmapCreateBitmap.getHeight();
                        int i14 = width * height;
                        int[] iArr2 = new int[i14];
                        bitmapCreateBitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
                        int i15 = width - 1;
                        int i16 = height - 1;
                        int i17 = i13 + i13;
                        int i18 = i17 + 1;
                        int[] iArr3 = new int[i14];
                        int[] iArr4 = new int[i14];
                        int[] iArr5 = new int[i14];
                        int[] iArr6 = new int[Math.max(width, height)];
                        int i19 = (i17 + 2) >> 1;
                        int i20 = i19 * i19;
                        int i21 = i20 * 256;
                        int[] iArr7 = new int[i21];
                        for (int i22 = 0; i22 < i21; i22++) {
                            iArr7[i22] = i22 / i20;
                        }
                        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i18, 3);
                        int i23 = i13 + 1;
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 0;
                        while (i24 < height) {
                            int i27 = -i13;
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 0;
                            int i33 = 0;
                            int i34 = 0;
                            int i35 = 0;
                            int i36 = 0;
                            while (i27 <= i13) {
                                Bitmap bitmap3 = bitmapCreateBitmap;
                                int i37 = height;
                                int i38 = iArr2[Math.min(i15, Math.max(i27, 0)) + i25];
                                int[] iArr9 = iArr8[i27 + i13];
                                iArr9[0] = (i38 & 16711680) >> 16;
                                iArr9[1] = (i38 & 65280) >> 8;
                                iArr9[2] = i38 & 255;
                                int iAbs = i23 - Math.abs(i27);
                                int i39 = iArr9[0];
                                i28 = (i39 * iAbs) + i28;
                                int i40 = iArr9[1];
                                i29 = (i40 * iAbs) + i29;
                                int i41 = iArr9[2];
                                i30 = (iAbs * i41) + i30;
                                if (i27 > 0) {
                                    i34 += i39;
                                    i35 += i40;
                                    i36 += i41;
                                } else {
                                    i31 += i39;
                                    i32 += i40;
                                    i33 += i41;
                                }
                                i27++;
                                height = i37;
                                bitmapCreateBitmap = bitmap3;
                            }
                            Bitmap bitmap4 = bitmapCreateBitmap;
                            int i42 = height;
                            int i43 = i13;
                            int i44 = 0;
                            while (i44 < width) {
                                iArr3[i25] = iArr7[i28];
                                iArr4[i25] = iArr7[i29];
                                iArr5[i25] = iArr7[i30];
                                int i45 = i28 - i31;
                                int i46 = i29 - i32;
                                int i47 = i30 - i33;
                                int[] iArr10 = iArr8[((i43 - i13) + i18) % i18];
                                int i48 = i31 - iArr10[0];
                                int i49 = i32 - iArr10[1];
                                int i50 = i33 - iArr10[2];
                                if (i24 == 0) {
                                    iArr6[i44] = Math.min(i44 + i13 + 1, i15);
                                }
                                int i51 = iArr2[i26 + iArr6[i44]];
                                int i52 = (i51 & 16711680) >> 16;
                                iArr10[0] = i52;
                                int i53 = (i51 & 65280) >> 8;
                                iArr10[1] = i53;
                                int i54 = i51 & 255;
                                iArr10[2] = i54;
                                int i55 = i34 + i52;
                                int i56 = i35 + i53;
                                int i57 = i36 + i54;
                                i28 = i45 + i55;
                                i29 = i46 + i56;
                                i30 = i47 + i57;
                                i43 = (i43 + 1) % i18;
                                int[] iArr11 = iArr8[i43 % i18];
                                int i58 = iArr11[0];
                                i31 = i48 + i58;
                                int i59 = iArr11[1];
                                i32 = i49 + i59;
                                int i60 = iArr11[2];
                                i33 = i50 + i60;
                                i34 = i55 - i58;
                                i35 = i56 - i59;
                                i36 = i57 - i60;
                                i25++;
                                i44++;
                                iArr7 = iArr7;
                            }
                            i26 += width;
                            i24++;
                            height = i42;
                            bitmapCreateBitmap = bitmap4;
                        }
                        Bitmap bitmap5 = bitmapCreateBitmap;
                        int i61 = height;
                        int[] iArr12 = iArr7;
                        int i62 = 0;
                        while (i62 < width) {
                            int i63 = -i13;
                            int i64 = i63 * width;
                            int i65 = 0;
                            int i66 = 0;
                            int i67 = 0;
                            int i68 = 0;
                            int i69 = 0;
                            int i70 = 0;
                            int i71 = 0;
                            int i72 = 0;
                            int i73 = 0;
                            while (i63 <= i13) {
                                int[] iArr13 = iArr6;
                                int iMax = Math.max(0, i64) + i62;
                                int[] iArr14 = iArr8[i63 + i13];
                                iArr14[0] = iArr3[iMax];
                                iArr14[1] = iArr4[iMax];
                                iArr14[2] = iArr5[iMax];
                                int iAbs2 = i23 - Math.abs(i63);
                                i65 = (iArr3[iMax] * iAbs2) + i65;
                                i66 = (iArr4[iMax] * iAbs2) + i66;
                                i67 = (iArr5[iMax] * iAbs2) + i67;
                                if (i63 > 0) {
                                    i71 += iArr14[0];
                                    i72 += iArr14[1];
                                    i73 += iArr14[2];
                                } else {
                                    i68 += iArr14[0];
                                    i69 += iArr14[1];
                                    i70 += iArr14[2];
                                }
                                if (i63 < i16) {
                                    i64 += width;
                                }
                                i63++;
                                iArr6 = iArr13;
                            }
                            int[] iArr15 = iArr6;
                            int i74 = 0;
                            int i75 = i61;
                            int i76 = i13;
                            int i77 = i62;
                            while (i74 < i75) {
                                iArr2[i77] = (iArr2[i77] & (-16777216)) | (iArr12[i65] << 16) | (iArr12[i66] << 8) | iArr12[i67];
                                int i78 = i65 - i68;
                                int i79 = i66 - i69;
                                int i80 = i67 - i70;
                                int[] iArr16 = iArr8[((i76 - i13) + i18) % i18];
                                int i81 = i68 - iArr16[0];
                                int i82 = i69 - iArr16[1];
                                int i83 = i70 - iArr16[2];
                                int i84 = i13;
                                if (i62 == 0) {
                                    iArr15[i74] = Math.min(i74 + i23, i16) * width;
                                }
                                int i85 = iArr15[i74] + i62;
                                int i86 = iArr3[i85];
                                iArr16[0] = i86;
                                int i87 = iArr4[i85];
                                iArr16[1] = i87;
                                int i88 = iArr5[i85];
                                iArr16[2] = i88;
                                int i89 = i71 + i86;
                                int i90 = i72 + i87;
                                int i91 = i73 + i88;
                                i65 = i78 + i89;
                                i66 = i79 + i90;
                                i67 = i80 + i91;
                                i76 = (i76 + 1) % i18;
                                int[] iArr17 = iArr8[i76];
                                int i92 = iArr17[0];
                                i68 = i81 + i92;
                                int i93 = iArr17[1];
                                i69 = i82 + i93;
                                int i94 = iArr17[2];
                                i70 = i83 + i94;
                                i71 = i89 - i92;
                                i72 = i90 - i93;
                                i73 = i91 - i94;
                                i77 += width;
                                i74++;
                                i13 = i84;
                            }
                            i62++;
                            i61 = i75;
                            iArr6 = iArr15;
                        }
                        bitmap5.setPixels(iArr2, 0, width, 0, 0, width, i61);
                        bitmap2 = bitmap5;
                    }
                    return bitmap2;
                }
            }
            if (iArr[i12] == 0) {
                return null;
            }
            i12++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    public static void b(Context context, Bitmap bitmap, int i10) throws Throwable {
        BaseObj baseObj;
        Allocation allocationCreateFromBitmap;
        Allocation allocationCreateTyped;
        RenderScript renderScript = null;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = null;
        try {
            RenderScript renderScriptCreate = RenderScript.create(context);
            try {
                renderScriptCreate.setMessageHandler(new RenderScript.RSMessageHandler());
                allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
                try {
                    allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
                    try {
                        scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                        scriptIntrinsicBlurCreate.setRadius(i10);
                        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
                        allocationCreateTyped.copyTo(bitmap);
                        RenderScript.releaseAllContexts();
                        allocationCreateFromBitmap.destroy();
                        allocationCreateTyped.destroy();
                        scriptIntrinsicBlurCreate.destroy();
                    } catch (Throwable th) {
                        th = th;
                        BaseObj baseObj2 = scriptIntrinsicBlurCreate;
                        renderScript = renderScriptCreate;
                        baseObj = baseObj2;
                        if (renderScript != null) {
                            RenderScript.releaseAllContexts();
                        }
                        if (allocationCreateFromBitmap != null) {
                            allocationCreateFromBitmap.destroy();
                        }
                        if (allocationCreateTyped != null) {
                            allocationCreateTyped.destroy();
                        }
                        if (baseObj != null) {
                            baseObj.destroy();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    allocationCreateTyped = null;
                    renderScript = renderScriptCreate;
                    baseObj = allocationCreateTyped;
                    if (renderScript != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (allocationCreateTyped != null) {
                        allocationCreateTyped.destroy();
                    }
                    if (baseObj != null) {
                        baseObj.destroy();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                allocationCreateFromBitmap = null;
                allocationCreateTyped = null;
            }
        } catch (Throwable th4) {
            th = th4;
            baseObj = null;
            allocationCreateFromBitmap = null;
            allocationCreateTyped = null;
        }
    }
}
