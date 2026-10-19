package p177o3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.C0891t;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p116j3.d;
import p116j3.o;
import p142l3.e;
import p164n3.j;
import p214r3.g;

/* JADX INFO: compiled from: TextLayer.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.airbnb.lottie.model.layer.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final StringBuilder f45197C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RectF f45198D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Matrix f45199E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final a f45200F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final b f45201G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final HashMap f45202H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0891t<String> f45203I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final ArrayList f45204J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final o f45205K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final LottieDrawable f45206L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p079g3.b f45207M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final p116j3.b f45208N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final p116j3.b f45209O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final d f45210P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final d f45211Q;

    /* JADX INFO: compiled from: TextLayer.java */
    public class a extends Paint {
    }

    /* JADX INFO: compiled from: TextLayer.java */
    public class b extends Paint {
    }

    /* JADX INFO: compiled from: TextLayer.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45212a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f45213b = 0.0f;
    }

    public f(LottieDrawable lottieDrawable, Layer layer) {
        p154m3.b bVar;
        p154m3.b bVar2;
        p154m3.a aVar;
        p154m3.a aVar2;
        super(lottieDrawable, layer);
        this.f45197C = new StringBuilder(2);
        this.f45198D = new RectF();
        this.f45199E = new Matrix();
        a aVar3 = new a(1);
        aVar3.setStyle(Paint.Style.FILL);
        this.f45200F = aVar3;
        b bVar3 = new b(1);
        bVar3.setStyle(Paint.Style.STROKE);
        this.f45201G = bVar3;
        this.f45202H = new HashMap();
        this.f45203I = new C0891t<>();
        this.f45204J = new ArrayList();
        this.f45206L = lottieDrawable;
        this.f45207M = layer.f23445b;
        o oVar = new o((List) layer.f23459q.f3048c);
        this.f45205K = oVar;
        oVar.a(this);
        d(oVar);
        androidx.compose.ui.autofill.a aVar4 = layer.f23460r;
        if (aVar4 != null && (aVar2 = (p154m3.a) aVar4.f13282a) != null) {
            p116j3.a<?, ?> aVarA = aVar2.a();
            this.f45208N = (p116j3.b) aVarA;
            aVarA.a(this);
            d(aVarA);
        }
        if (aVar4 != null && (aVar = (p154m3.a) aVar4.f13283b) != null) {
            p116j3.a<?, ?> aVarA2 = aVar.a();
            this.f45209O = (p116j3.b) aVarA2;
            aVarA2.a(this);
            d(aVarA2);
        }
        if (aVar4 != null && (bVar2 = (p154m3.b) aVar4.f13284c) != null) {
            p116j3.a<?, ?> aVarA3 = bVar2.a();
            this.f45210P = (d) aVarA3;
            aVarA3.a(this);
            d(aVarA3);
        }
        if (aVar4 == null || (bVar = (p154m3.b) aVar4.f13285d) == null) {
            return;
        }
        p116j3.a<?, ?> aVarA4 = bVar.a();
        this.f45211Q = (d) aVarA4;
        aVarA4.a(this);
        d(aVarA4);
    }

    public static void p(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void q(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    public static void s(Canvas canvas, DocumentData documentData, int i10, float f10) {
        PointF pointF = documentData.f23375l;
        PointF pointF2 = documentData.f23376m;
        float fC = g.c();
        float f11 = (i10 * documentData.f23370f * fC) + (pointF == null ? 0.0f : (documentData.f23370f * fC) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int iOrdinal = documentData.f23368d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f12, f11);
        } else if (iOrdinal == 1) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (iOrdinal != 2) {
                return;
            }
            canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, p104i3.d
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        p079g3.b bVar = this.f45207M;
        rectF.set(0.0f, 0.0f, bVar.f35560i.width(), bVar.f35560i.height());
    }

    /* JADX WARN: Code duplicated, block: B:111:0x030e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0316  */
    /* JADX WARN: Code duplicated, block: B:116:0x033a  */
    /* JADX WARN: Code duplicated, block: B:119:0x036c  */
    /* JADX WARN: Code duplicated, block: B:121:0x0377  */
    /* JADX WARN: Code duplicated, block: B:122:0x0379  */
    /* JADX WARN: Code duplicated, block: B:126:0x038d  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:132:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x0412  */
    /* JADX WARN: Code duplicated, block: B:151:0x041b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0426 A[LOOP:9: B:152:0x0424->B:153:0x0426, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x0446  */
    /* JADX WARN: Code duplicated, block: B:158:0x044d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0402 A[SYNTHETIC] */
    @Override // com.airbnb.lottie.model.layer.a
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        p142l3.b bVar;
        String str;
        p129k3.a aVar;
        Typeface typefaceCreateFromAsset;
        int i11;
        float fFloatValue;
        float fC;
        List listAsList;
        int size;
        int i12;
        int i13;
        PointF pointF;
        float f10;
        List<c> listT;
        int i14;
        int i15;
        String str2;
        int length;
        int iCodePointAt;
        int iCharCount;
        int i16;
        List list;
        long j;
        C0891t<String> c0891t;
        StringBuilder sb2;
        int iCharCount2;
        String strB;
        int iCodePointAt2;
        List list2;
        float f11;
        DocumentData documentDataE = this.f45205K.e();
        p079g3.b bVar2 = this.f45207M;
        p142l3.b bVar3 = (p142l3.b) bVar2.f35556e.get(documentDataE.f23366b);
        if (bVar3 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        a aVar2 = this.f45200F;
        p116j3.b bVar4 = this.f45208N;
        if (bVar4 != null) {
            aVar2.setColor(bVar4.e().intValue());
        } else {
            aVar2.setColor(documentDataE.f23372h);
        }
        b bVar5 = this.f45201G;
        p116j3.b bVar6 = this.f45209O;
        if (bVar6 != null) {
            bVar5.setColor(bVar6.e().intValue());
        } else {
            bVar5.setColor(documentDataE.f23373i);
        }
        p116j3.a<Integer, Integer> aVar3 = this.f23497w.j;
        int iIntValue = ((((aVar3 == null ? 100 : aVar3.e().intValue()) * 255) / 100) * i10) / 255;
        aVar2.setAlpha(iIntValue);
        bVar5.setAlpha(iIntValue);
        d dVar = this.f45210P;
        if (dVar != null) {
            bVar5.setStrokeWidth(dVar.e().floatValue());
        } else {
            bVar5.setStrokeWidth(g.c() * documentDataE.j);
        }
        LottieDrawable lottieDrawable = this.f45206L;
        Map<String, Typeface> map = lottieDrawable.f23319i;
        d dVar2 = this.f45211Q;
        String str3 = "\n";
        String str4 = bVar3.f44345c;
        String str5 = bVar3.f44343a;
        if (map != null || lottieDrawable.f23312b.f35557f.f() <= 0) {
            Map<String, Typeface> map2 = lottieDrawable.f23319i;
            if (map2 != null) {
                if (map2.containsKey(str5)) {
                    typefaceCreateFromAsset = map2.get(str5);
                    str3 = "\n";
                    bVar = bVar3;
                } else {
                    bVar = bVar3;
                    String str6 = bVar.f44344b;
                    if (map2.containsKey(str6)) {
                        typefaceCreateFromAsset = map2.get(str6);
                    } else {
                        String strF = O.a.f(str5, "-", str);
                        if (map2.containsKey(strF)) {
                            str = str4;
                            typefaceCreateFromAsset = map2.get(strF);
                        }
                    }
                    str3 = "\n";
                }
                if (typefaceCreateFromAsset == null) {
                    typefaceCreateFromAsset = bVar.f44346d;
                }
                if (typefaceCreateFromAsset != null) {
                    String str7 = documentDataE.f23365a;
                    aVar2.setTypeface(typefaceCreateFromAsset);
                    float f12 = documentDataE.f23367c;
                    aVar2.setTextSize(g.c() * f12);
                    bVar5.setTypeface(aVar2.getTypeface());
                    bVar5.setTextSize(aVar2.getTextSize());
                    fFloatValue = documentDataE.f23369e / 10.0f;
                    if (dVar2 != null) {
                        fFloatValue += dVar2.e().floatValue();
                    }
                    fC = ((g.c() * fFloatValue) * f12) / 100.0f;
                    listAsList = Arrays.asList(str7.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str3, "\r").split("\r"));
                    size = listAsList.size();
                    i13 = -1;
                    for (i12 = 0; i12 < size; i12++) {
                        String str8 = (String) listAsList.get(i12);
                        pointF = documentDataE.f23376m;
                        if (pointF == null) {
                            f10 = 0.0f;
                        } else {
                            f10 = pointF.x;
                        }
                        listT = t(str8, f10, bVar, 0.0f, fC, false);
                        i14 = 0;
                        while (i14 < listT.size()) {
                            c cVar = listT.get(i14);
                            i15 = i13 + 1;
                            canvas.save();
                            s(canvas, documentDataE, i15, cVar.f45213b);
                            str2 = cVar.f45212a;
                            length = 0;
                            while (length < str2.length()) {
                                iCodePointAt = str2.codePointAt(length);
                                iCharCount = Character.charCount(iCodePointAt) + length;
                                List<c> list3 = listT;
                                while (true) {
                                    if (iCharCount < str2.length()) {
                                        i16 = i15;
                                        list = listAsList;
                                        break;
                                    }
                                    iCodePointAt2 = str2.codePointAt(iCharCount);
                                    i16 = i15;
                                    list = listAsList;
                                    if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                        break;
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    i15 = i16;
                                    listAsList = list;
                                }
                                p142l3.b bVar7 = bVar;
                                int i17 = size;
                                j = iCodePointAt;
                                c0891t = this.f45203I;
                                if (c0891t.c(j) >= 0) {
                                    strB = c0891t.b(j);
                                } else {
                                    sb2 = this.f45197C;
                                    sb2.setLength(0);
                                    iCharCount2 = length;
                                    while (iCharCount2 < iCharCount) {
                                        int iCodePointAt3 = str2.codePointAt(iCharCount2);
                                        sb2.appendCodePoint(iCodePointAt3);
                                        iCharCount2 += Character.charCount(iCodePointAt3);
                                    }
                                    String string = sb2.toString();
                                    c0891t.e(string, j);
                                    strB = string;
                                }
                                length += strB.length();
                                if (documentDataE.f23374k) {
                                    p(strB, aVar2, canvas);
                                    p(strB, bVar5, canvas);
                                } else {
                                    p(strB, bVar5, canvas);
                                    p(strB, aVar2, canvas);
                                }
                                canvas.translate(aVar2.measureText(strB) + fC, 0.0f);
                                listT = list3;
                                i15 = i16;
                                listAsList = list;
                                size = i17;
                                bVar = bVar7;
                            }
                            canvas.restore();
                            i14++;
                            i13 = i15;
                        }
                    }
                }
            } else {
                bVar = bVar3;
                str = str4;
            }
            str = str4;
            if (lottieDrawable.getCallback() == null) {
                aVar = null;
            } else {
                if (lottieDrawable.f23318h == null) {
                    lottieDrawable.f23318h = new p129k3.a(lottieDrawable.getCallback());
                }
                aVar = lottieDrawable.f23318h;
            }
            if (aVar != null) {
                e<String> eVar = aVar.f41575a;
                eVar.f44354a = str5;
                eVar.f44355b = str;
                HashMap map3 = aVar.f41576b;
                Typeface typeface = (Typeface) map3.get(eVar);
                if (typeface != null) {
                    typefaceCreateFromAsset = typeface;
                    str3 = "\n";
                } else {
                    HashMap map4 = aVar.f41577c;
                    Typeface typeface2 = (Typeface) map4.get(str5);
                    if (typeface2 != null) {
                        typefaceCreateFromAsset = typeface2;
                    } else {
                        Typeface typeface3 = bVar.f44346d;
                        if (typeface3 != null) {
                            typefaceCreateFromAsset = typeface3;
                        } else {
                            typefaceCreateFromAsset = Typeface.createFromAsset(aVar.f41578d, "fonts/" + str5 + aVar.f41579e);
                            map4.put(str5, typefaceCreateFromAsset);
                        }
                    }
                    boolean zContains = str.contains("Italic");
                    boolean zContains2 = str.contains("Bold");
                    if (zContains && zContains2) {
                        i11 = 3;
                    } else if (zContains) {
                        i11 = 2;
                    } else {
                        i11 = zContains2 ? 1 : 0;
                    }
                    if (typefaceCreateFromAsset.getStyle() != i11) {
                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i11);
                    }
                    map3.put(eVar, typefaceCreateFromAsset);
                }
            } else {
                str3 = "\n";
                typefaceCreateFromAsset = null;
            }
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = bVar.f44346d;
            }
            if (typefaceCreateFromAsset != null) {
                String str9 = documentDataE.f23365a;
                aVar2.setTypeface(typefaceCreateFromAsset);
                float f13 = documentDataE.f23367c;
                aVar2.setTextSize(g.c() * f13);
                bVar5.setTypeface(aVar2.getTypeface());
                bVar5.setTextSize(aVar2.getTextSize());
                fFloatValue = documentDataE.f23369e / 10.0f;
                if (dVar2 != null) {
                    fFloatValue += dVar2.e().floatValue();
                }
                fC = ((g.c() * fFloatValue) * f13) / 100.0f;
                listAsList = Arrays.asList(str9.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str3, "\r").split("\r"));
                size = listAsList.size();
                i13 = -1;
                while (i12 < size) {
                    String str10 = (String) listAsList.get(i12);
                    pointF = documentDataE.f23376m;
                    if (pointF == null) {
                        f10 = 0.0f;
                    } else {
                        f10 = pointF.x;
                    }
                    listT = t(str10, f10, bVar, 0.0f, fC, false);
                    i14 = 0;
                    while (i14 < listT.size()) {
                        c cVar2 = listT.get(i14);
                        i15 = i13 + 1;
                        canvas.save();
                        s(canvas, documentDataE, i15, cVar2.f45213b);
                        str2 = cVar2.f45212a;
                        length = 0;
                        while (length < str2.length()) {
                            iCodePointAt = str2.codePointAt(length);
                            iCharCount = Character.charCount(iCodePointAt) + length;
                            List<c> list4 = listT;
                            while (true) {
                                if (iCharCount < str2.length()) {
                                    i16 = i15;
                                    list = listAsList;
                                    break;
                                }
                                iCodePointAt2 = str2.codePointAt(iCharCount);
                                i16 = i15;
                                list = listAsList;
                                if (Character.getType(iCodePointAt2) == 16) {
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                                iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                i15 = i16;
                                listAsList = list;
                            }
                            p142l3.b bVar8 = bVar;
                            int i18 = size;
                            j = iCodePointAt;
                            c0891t = this.f45203I;
                            if (c0891t.c(j) >= 0) {
                                strB = c0891t.b(j);
                            } else {
                                sb2 = this.f45197C;
                                sb2.setLength(0);
                                iCharCount2 = length;
                                while (iCharCount2 < iCharCount) {
                                    int iCodePointAt4 = str2.codePointAt(iCharCount2);
                                    sb2.appendCodePoint(iCodePointAt4);
                                    iCharCount2 += Character.charCount(iCodePointAt4);
                                }
                                String string2 = sb2.toString();
                                c0891t.e(string2, j);
                                strB = string2;
                            }
                            length += strB.length();
                            if (documentDataE.f23374k) {
                                p(strB, aVar2, canvas);
                                p(strB, bVar5, canvas);
                            } else {
                                p(strB, bVar5, canvas);
                                p(strB, aVar2, canvas);
                            }
                            canvas.translate(aVar2.measureText(strB) + fC, 0.0f);
                            listT = list4;
                            i15 = i16;
                            listAsList = list;
                            size = i18;
                            bVar = bVar8;
                        }
                        canvas.restore();
                        i14++;
                        i13 = i15;
                    }
                }
            }
        } else {
            float f14 = documentDataE.f23367c / 100.0f;
            g.d(matrix);
            float f15 = f14;
            List listAsList2 = Arrays.asList(documentDataE.f23365a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = listAsList2.size();
            float fFloatValue2 = documentDataE.f23369e / 10.0f;
            if (dVar2 != null) {
                fFloatValue2 += dVar2.e().floatValue();
            }
            float f16 = fFloatValue2;
            int i19 = 0;
            int i20 = -1;
            while (i19 < size2) {
                String str11 = (String) listAsList2.get(i19);
                PointF pointF2 = documentDataE.f23376m;
                float f17 = f15;
                int i21 = i19;
                p142l3.b bVar9 = bVar3;
                int i22 = size2;
                List list5 = listAsList2;
                p142l3.b bVar10 = bVar3;
                String str12 = str5;
                List<c> listT2 = t(str11, pointF2 == null ? 0.0f : pointF2.x, bVar9, f17, f16, true);
                int i23 = 0;
                while (i23 < listT2.size()) {
                    c cVar3 = listT2.get(i23);
                    int i24 = i20 + 1;
                    canvas.save();
                    s(canvas, documentDataE, i24, cVar3.f45213b);
                    String str13 = cVar3.f45212a;
                    int i25 = 0;
                    while (i25 < str13.length()) {
                        p142l3.c cVarC = bVar2.f35557f.c(p142l3.c.a(str13.charAt(i25), str12, str4));
                        if (cVarC == null) {
                            f11 = f17;
                            listT2 = listT2;
                            str13 = str13;
                            i24 = i24;
                            str4 = str4;
                        } else {
                            HashMap map5 = this.f45202H;
                            if (map5.containsKey(cVarC)) {
                                list2 = (List) map5.get(cVarC);
                            } else {
                                ArrayList arrayList = cVarC.f44347a;
                                int size3 = arrayList.size();
                                ArrayList arrayList2 = new ArrayList(size3);
                                int i26 = 0;
                                while (i26 < size3) {
                                    arrayList2.add(new p104i3.c(lottieDrawable, this, (j) arrayList.get(i26), bVar2));
                                    i26++;
                                    size3 = size3;
                                    arrayList = arrayList;
                                }
                                map5.put(cVarC, arrayList2);
                                list2 = arrayList2;
                            }
                            int i27 = 0;
                            while (i27 < list2.size()) {
                                Path path = ((p104i3.c) list2.get(i27)).getPath();
                                path.computeBounds(this.f45198D, false);
                                Matrix matrix2 = this.f45199E;
                                matrix2.reset();
                                List list6 = list2;
                                matrix2.preTranslate(0.0f, (-documentDataE.f23371g) * g.c());
                                float f18 = f17;
                                matrix2.preScale(f18, f18);
                                path.transform(matrix2);
                                if (documentDataE.f23374k) {
                                    q(path, aVar2, canvas);
                                    q(path, bVar5, canvas);
                                } else {
                                    q(path, bVar5, canvas);
                                    q(path, aVar2, canvas);
                                }
                                i27++;
                                f17 = f18;
                                list2 = list6;
                            }
                            f11 = f17;
                            canvas.translate((g.c() * ((float) cVarC.f44349c) * f11) + f16, 0.0f);
                        }
                        i25++;
                        f17 = f11;
                        str13 = str13;
                        listT2 = listT2;
                        i24 = i24;
                        str4 = str4;
                    }
                    canvas.restore();
                    i23++;
                    i20 = i24;
                }
                i19 = i21 + 1;
                f15 = f17;
                str5 = str12;
                size2 = i22;
                listAsList2 = list5;
                bVar3 = bVar10;
            }
        }
        canvas.restore();
    }

    public final c r(int i10) {
        ArrayList arrayList = this.f45204J;
        for (int size = arrayList.size(); size < i10; size++) {
            arrayList.add(new c());
        }
        return (c) arrayList.get(i10 - 1);
    }

    public final List<c> t(String str, float f10, p142l3.b bVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                p142l3.c cVarC = this.f45207M.f35557f.c(p142l3.c.a(cCharAt, bVar.f44343a, bVar.f44345c));
                if (cVarC != null) {
                    fMeasureText = (g.c() * ((float) cVarC.f44349c) * f11) + f12;
                }
            } else {
                fMeasureText = this.f45200F.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z11 = true;
                f15 = fMeasureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                c cVarR = r(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    float length = (f13 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f15);
                    cVarR.f45212a = strTrim;
                    cVarR.f45213b = length;
                    i11 = i13;
                    i12 = i11;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15;
                    cVarR.f45212a = strTrim2;
                    cVarR.f45213b = length2;
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            c cVarR2 = r(i10);
            cVarR2.f45212a = str.substring(i11);
            cVarR2.f45213b = f13;
        }
        return this.f45204J.subList(0, i10);
    }
}
