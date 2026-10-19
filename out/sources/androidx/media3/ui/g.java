package androidx.media3.ui;

import D9.o;
import J4.i;
import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import androidx.compose.foundation.C0936h;
import com.google.common.collect.ImmutableMap;
import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import io.intercom.android.sdk.models.carousel.BlockAlignment;
import io.intercom.android.sdk.models.carousel.VerticalAlignment;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p114j1.A;
import p128k2.q;
import p128k2.s;

/* JADX INFO: compiled from: WebViewSubtitleOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class g extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.ui.a f19060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f19061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<p102i1.a> f19062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p128k2.a f19063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f19064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f19065g;

    /* JADX INFO: compiled from: WebViewSubtitleOutput.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19066a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f19066a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19066a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19066a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(Context context) {
        super(context, null);
        this.f19062d = Collections.emptyList();
        this.f19063e = p128k2.a.f41475g;
        this.f19064f = 0.0533f;
        this.f19065g = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context);
        this.f19060b = aVar;
        s sVar = new s(context, null);
        this.f19061c = sVar;
        sVar.setBackgroundColor(0);
        addView(aVar);
        addView(sVar);
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, p128k2.a aVar, float f10, float f11) {
        this.f19063e = aVar;
        this.f19064f = f10;
        this.f19065g = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p102i1.a aVar2 = (p102i1.a) list.get(i10);
            if (aVar2.f36514d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f19062d.isEmpty() || !arrayList2.isEmpty()) {
            this.f19062d = arrayList2;
            c();
        }
        this.f19060b.a(arrayList, aVar, f10, f11);
        invalidate();
    }

    public final String b(float f10, int i10) {
        float fB = q.b(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fB == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fB / getContext().getResources().getDisplayMetrics().density)};
        int i11 = A.f40996a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:258:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:264:0x0612  */
    /* JADX WARN: Code duplicated, block: B:268:0x062f  */
    /* JADX WARN: Code duplicated, block: B:274:0x063b  */
    /* JADX WARN: Code duplicated, block: B:276:0x0652  */
    /* JADX WARN: Code duplicated, block: B:279:0x0674  */
    /* JADX WARN: Code duplicated, block: B:281:0x067f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0682  */
    /* JADX WARN: Code duplicated, block: B:284:0x0685  */
    /* JADX WARN: Code duplicated, block: B:285:0x0688  */
    /* JADX WARN: Code duplicated, block: B:287:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f8  */
    public final void c() {
        String strConcat;
        String str;
        boolean z10;
        String str2;
        int i10;
        String str3;
        String str4;
        String str5;
        Object obj;
        Object obj2;
        String str6;
        int i11;
        char c10;
        e.a aVar;
        Object[] objArr;
        String str7;
        int i12;
        int i13;
        String strB;
        String str8;
        float f10;
        String str9;
        String str10;
        Layout.Alignment alignment;
        int i14;
        int i15;
        String str11;
        int i16;
        String str12;
        String str13;
        boolean z11;
        g gVar = this;
        int i17 = 1;
        StringBuilder sb2 = new StringBuilder();
        String strT = o.t(gVar.f19063e.f41476a);
        int i18 = 0;
        String strB2 = gVar.b(gVar.f19064f, 0);
        Float fValueOf = Float.valueOf(1.2f);
        p128k2.a aVar2 = gVar.f19063e;
        int i19 = aVar2.f41479d;
        int i20 = 2;
        int i21 = aVar2.f41480e;
        if (i19 == 1) {
            Object[] objArr2 = {o.t(i21)};
            int i22 = A.f40996a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr2);
        } else if (i19 == 2) {
            String strT2 = o.t(i21);
            int i23 = A.f40996a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strT2);
        } else if (i19 == 3) {
            String strT3 = o.t(i21);
            int i24 = A.f40996a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strT3);
        } else if (i19 != 4) {
            strConcat = "unset";
        } else {
            String strT4 = o.t(i21);
            int i25 = A.f40996a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strT4);
        }
        Object[] objArr3 = {strT, strB2, fValueOf, strConcat};
        int i26 = A.f40996a;
        sb2.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr3));
        HashMap map = new HashMap();
        String strT5 = o.t(gVar.f19063e.f41477b);
        String str14 = "background-color:";
        StringBuilder sb3 = new StringBuilder("background-color:");
        sb3.append(strT5);
        String str15 = ";";
        sb3.append(";");
        map.put(".default_bg,.default_bg *", sb3.toString());
        int i27 = 0;
        while (i27 < gVar.f19062d.size()) {
            p102i1.a aVar3 = gVar.f19062d.get(i27);
            float f11 = aVar3.f36518h;
            float f12 = f11 != -3.4028235E38f ? f11 * 100.0f : 50.0f;
            int i28 = -100;
            int i29 = aVar3.f36519i;
            int i30 = i29 != i17 ? i29 != i20 ? i18 : -100 : -50;
            float f13 = aVar3.f36515e;
            int i31 = aVar3.f36525p;
            if (f13 == -3.4028235E38f) {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - gVar.f19065g) * 100.0f));
                z10 = false;
            } else if (aVar3.f36516f != i17) {
                String str16 = String.format(Locale.US, "%.2f%%", Float.valueOf(f13 * 100.0f));
                int i32 = aVar3.f36517g;
                if (i31 == i17) {
                    i28 = -(i32 != i17 ? i32 != i20 ? 0 : -100 : -50);
                } else if (i32 == i17) {
                    i28 = -50;
                } else if (i32 != i20) {
                    i28 = 0;
                }
                str = str16;
                z10 = false;
            } else {
                if (f13 >= 0.0f) {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(f13 * 1.2f));
                    z10 = false;
                } else {
                    str = String.format(Locale.US, "%.2fem", Float.valueOf(((-f13) - 1.0f) * 1.2f));
                    z10 = true;
                }
                i28 = 0;
            }
            float f14 = aVar3.j;
            String str17 = f14 != -3.4028235E38f ? String.format(Locale.US, "%.2f%%", Float.valueOf(f14 * 100.0f)) : "fit-content";
            Layout.Alignment alignment2 = aVar3.f36512b;
            if (alignment2 == null) {
                str2 = OpsMetricTracker.START;
                str3 = "center";
                i10 = 2;
            } else {
                int i33 = a.f19066a[alignment2.ordinal()];
                str2 = OpsMetricTracker.START;
                if (i33 != 1) {
                    i10 = 2;
                    str3 = i33 != 2 ? "center" : "end";
                } else {
                    i10 = 2;
                    str3 = str2;
                }
            }
            String str18 = i31 != 1 ? i31 != i10 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
            String strB3 = gVar.b(aVar3.f36524o, aVar3.f36523n);
            String strT6 = o.t(aVar3.f36521l ? aVar3.f36522m : gVar.f19063e.f41478c);
            String str19 = VerticalAlignment.TOP;
            if (i31 == 1) {
                if (z10) {
                    str4 = BlockAlignment.LEFT;
                } else {
                    str4 = BlockAlignment.RIGHT;
                }
                str5 = str4;
                obj = VerticalAlignment.TOP;
            } else if (i31 != 2) {
                if (z10) {
                    str19 = VerticalAlignment.BOTTOM;
                }
                str5 = str19;
                obj = BlockAlignment.LEFT;
            } else {
                if (z10) {
                    str4 = BlockAlignment.RIGHT;
                } else {
                    str4 = BlockAlignment.LEFT;
                }
                str5 = str4;
                obj = VerticalAlignment.TOP;
            }
            if (i31 == 2 || i31 == 1) {
                obj2 = "height";
                int i34 = i28;
                i28 = i30;
                i30 = i34;
            } else {
                obj2 = "width";
            }
            float f15 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern = e.f19049a;
            String str20 = "</span>";
            String str21 = ";'>";
            CharSequence charSequence = aVar3.f36511a;
            if (charSequence == null) {
                aVar = new e.a("", ImmutableMap.h());
                str6 = "";
            } else {
                str6 = "";
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    HashSet hashSet = new HashSet();
                    str20 = "</span>";
                    sb2 = sb2;
                    BackgroundColorSpan[] backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    int length = backgroundColorSpanArr.length;
                    int i35 = 0;
                    while (i35 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i35].getBackgroundColor()));
                        i35++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    HashMap map2 = new HashMap();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        String strB4 = i.b(iIntValue, "bg_");
                        Iterator it2 = it;
                        p102i1.a aVar4 = aVar3;
                        String strD = C0936h.d(".", strB4, ",.", strB4, " *");
                        String strT7 = o.t(iIntValue);
                        int i36 = A.f40996a;
                        Locale locale4 = Locale.US;
                        map2.put(strD, str14 + strT7 + str15);
                        it = it2;
                        i31 = i31;
                        aVar3 = aVar4;
                    }
                    aVar3 = aVar3;
                    i11 = i31;
                    SparseArray sparseArray = new SparseArray();
                    Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
                    int length2 = spans.length;
                    int i37 = 0;
                    while (i37 < length2) {
                        Object obj3 = spans[i37];
                        String str22 = str15;
                        boolean z12 = obj3 instanceof StrikethroughSpan;
                        String str23 = null;
                        if (z12) {
                            str7 = str14;
                            i12 = length2;
                            objArr = spans;
                            strB = "<span style='text-decoration:line-through;'>";
                        } else {
                            objArr = spans;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strT8 = o.t(((ForegroundColorSpan) obj3).getForegroundColor());
                                int i38 = A.f40996a;
                                Locale locale5 = Locale.US;
                                str7 = str14;
                                strB = androidx.compose.foundation.gestures.d.b("<span style='color:", strT8, str21);
                                i12 = length2;
                            } else {
                                str7 = str14;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    int i39 = A.f40996a;
                                    Locale locale6 = Locale.US;
                                    i12 = length2;
                                    strB = i.c(backgroundColor, "<span class='bg_", "'>");
                                } else {
                                    i12 = length2;
                                    if (obj3 instanceof p102i1.d) {
                                        strB = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        Object[] objArr4 = {Float.valueOf(absoluteSizeSpan.getDip() ? absoluteSizeSpan.getSize() : absoluteSizeSpan.getSize() / f15)};
                                        int i40 = A.f40996a;
                                        strB = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr4);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr5 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        int i41 = A.f40996a;
                                        strB = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr5);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        String family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            int i42 = A.f40996a;
                                            Locale locale7 = Locale.US;
                                            strB = androidx.compose.foundation.gestures.d.b("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strB = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        int style = ((StyleSpan) obj3).getStyle();
                                        if (style == 1) {
                                            strB = "<b>";
                                        } else if (style == 2) {
                                            strB = "<i>";
                                        } else if (style != 3) {
                                            strB = null;
                                        } else {
                                            strB = "<b><i>";
                                        }
                                    } else if (obj3 instanceof p102i1.f) {
                                        int i43 = ((p102i1.f) obj3).f36553b;
                                        if (i43 == -1) {
                                            strB = "<ruby style='ruby-position:unset;'>";
                                        } else if (i43 == 1) {
                                            strB = "<ruby style='ruby-position:over;'>";
                                        } else if (i43 != 2) {
                                            strB = null;
                                        } else {
                                            strB = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strB = "<u>";
                                    } else if (obj3 instanceof p102i1.g) {
                                        p102i1.g gVar2 = (p102i1.g) obj3;
                                        int i44 = gVar2.f36557a;
                                        StringBuilder sb4 = new StringBuilder();
                                        int i45 = gVar2.f36558b;
                                        if (i45 != 1) {
                                            i13 = 2;
                                            if (i45 == 2) {
                                                sb4.append("open ");
                                            }
                                        } else {
                                            i13 = 2;
                                            sb4.append("filled ");
                                        }
                                        if (i44 == 0) {
                                            sb4.append("none");
                                        } else if (i44 == 1) {
                                            sb4.append("circle");
                                        } else if (i44 == i13) {
                                            sb4.append("dot");
                                        } else if (i44 != 3) {
                                            sb4.append("unset");
                                        } else {
                                            sb4.append("sesame");
                                        }
                                        Object[] objArr6 = {sb4.toString(), gVar2.f36559c != 2 ? "over right" : "under left"};
                                        int i46 = A.f40996a;
                                        strB = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr6);
                                    } else {
                                        strB = null;
                                    }
                                }
                            }
                        }
                        if (z12 || (obj3 instanceof ForegroundColorSpan) || (obj3 instanceof BackgroundColorSpan) || (obj3 instanceof p102i1.d) || (obj3 instanceof AbsoluteSizeSpan) || (obj3 instanceof RelativeSizeSpan) || (obj3 instanceof p102i1.g)) {
                            str8 = str20;
                        } else if (obj3 instanceof TypefaceSpan) {
                            str8 = ((TypefaceSpan) obj3).getFamily() != null ? str20 : null;
                        } else {
                            if (obj3 instanceof StyleSpan) {
                                int style2 = ((StyleSpan) obj3).getStyle();
                                if (style2 == 1) {
                                    str23 = "</b>";
                                } else if (style2 == 2) {
                                    str23 = "</i>";
                                } else if (style2 == 3) {
                                    str23 = "</i></b>";
                                }
                            } else if (obj3 instanceof p102i1.f) {
                                str23 = "<rt>" + e.a(((p102i1.f) obj3).f36552a) + "</rt></ruby>";
                            } else if (obj3 instanceof UnderlineSpan) {
                                str23 = "</u>";
                            }
                            str8 = str23;
                        }
                        int spanStart = spanned.getSpanStart(obj3);
                        int spanEnd = spanned.getSpanEnd(obj3);
                        if (strB != null) {
                            str8.getClass();
                            e.b bVar = new e.b(spanStart, spanEnd, strB, str8);
                            e.c cVar = (e.c) sparseArray.get(spanStart);
                            if (cVar == null) {
                                cVar = new e.c();
                                sparseArray.put(spanStart, cVar);
                            }
                            cVar.f19058a.add(bVar);
                            e.c cVar2 = (e.c) sparseArray.get(spanEnd);
                            if (cVar2 == null) {
                                cVar2 = new e.c();
                                sparseArray.put(spanEnd, cVar2);
                            }
                            cVar2.f19059b.add(bVar);
                        }
                        i37++;
                        spans = objArr;
                        length2 = i12;
                        str15 = str22;
                        str14 = str7;
                        f15 = f15;
                        str21 = str21;
                    }
                    str15 = str15;
                    str21 = str21;
                    str14 = str14;
                    c10 = 3;
                    StringBuilder sb5 = new StringBuilder(spanned.length());
                    int i47 = 0;
                    int i48 = 0;
                    while (i47 < sparseArray.size()) {
                        int iKeyAt = sparseArray.keyAt(i47);
                        sb5.append(e.a(spanned.subSequence(i48, iKeyAt)));
                        e.c cVar3 = (e.c) sparseArray.get(iKeyAt);
                        Collections.sort(cVar3.f19059b, e.b.f19053f);
                        Iterator it3 = cVar3.f19059b.iterator();
                        while (it3.hasNext()) {
                            sb5.append(((e.b) it3.next()).f19057d);
                        }
                        ArrayList arrayList = cVar3.f19058a;
                        Collections.sort(arrayList, e.b.f19052e);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            sb5.append(((e.b) it4.next()).f19056c);
                        }
                        i47++;
                        i48 = iKeyAt;
                    }
                    sb5.append(e.a(spanned.subSequence(i48, spanned.length())));
                    aVar = new e.a(sb5.toString(), map2);
                } else {
                    aVar = new e.a(e.a(charSequence), ImmutableMap.h());
                }
                for (String str24 : map.keySet()) {
                    str13 = (String) map.put(str24, (String) map.get(str24));
                    if (str13 != null || str13.equals(map.get(str24))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    p241t7.b.k(z11);
                }
                Integer numValueOf = Integer.valueOf(i27);
                Float fValueOf2 = Float.valueOf(f12);
                Integer numValueOf2 = Integer.valueOf(i30);
                Integer numValueOf3 = Integer.valueOf(i28);
                p102i1.a aVar5 = aVar3;
                f10 = aVar5.f36526q;
                if (f10 != 0.0f) {
                    i16 = i11;
                    if (i16 != 2 || i16 == 1) {
                        str12 = "skewY";
                    } else {
                        str12 = "skewX";
                    }
                    Object[] objArr7 = {str12, Float.valueOf(f10)};
                    int i49 = A.f40996a;
                    str9 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                } else {
                    str9 = str6;
                }
                String str25 = String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj, fValueOf2, str5, str, obj2, str17, str3, str18, strB3, strT6, numValueOf2, numValueOf3, str9);
                sb2 = sb2;
                sb2.append(str25);
                sb2.append("<span class='default_bg'>");
                str10 = aVar.f19050a;
                alignment = aVar5.f36513c;
                if (alignment != null) {
                    i15 = a.f19066a[alignment.ordinal()];
                    if (i15 != 1) {
                        i14 = 2;
                        if (i15 != 2) {
                            str11 = "center";
                        } else {
                            str11 = "end";
                        }
                    } else {
                        i14 = 2;
                        str11 = str2;
                    }
                    sb2.append("<span style='display:inline-block; text-align:" + str11 + str21);
                    sb2.append(str10);
                    sb2.append(str20);
                } else {
                    i14 = 2;
                    sb2.append(str10);
                }
                sb2.append("</span></div>");
                i27++;
                i17 = 1;
                i20 = i14;
                str15 = str15;
                str14 = str14;
                i18 = 0;
                gVar = this;
            }
            i11 = i31;
            c10 = 3;
            while (r0.hasNext()) {
                str13 = (String) map.put(str24, (String) map.get(str24));
                if (str13 != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                p241t7.b.k(z11);
            }
            Integer numValueOf4 = Integer.valueOf(i27);
            Float fValueOf3 = Float.valueOf(f12);
            Integer numValueOf5 = Integer.valueOf(i30);
            Integer numValueOf6 = Integer.valueOf(i28);
            p102i1.a aVar6 = aVar3;
            f10 = aVar6.f36526q;
            if (f10 != 0.0f) {
                i16 = i11;
                if (i16 != 2) {
                    str12 = "skewY";
                } else {
                    str12 = "skewY";
                }
                Object[] objArr8 = {str12, Float.valueOf(f10)};
                int i410 = A.f40996a;
                str9 = String.format(Locale.US, "%s(%.2fdeg)", objArr8);
            } else {
                str9 = str6;
            }
            String str26 = String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj, fValueOf3, str5, str, obj2, str17, str3, str18, strB3, strT6, numValueOf5, numValueOf6, str9);
            sb2 = sb2;
            sb2.append(str26);
            sb2.append("<span class='default_bg'>");
            str10 = aVar.f19050a;
            alignment = aVar6.f36513c;
            if (alignment != null) {
                i15 = a.f19066a[alignment.ordinal()];
                if (i15 != 1) {
                    i14 = 2;
                    if (i15 != 2) {
                        str11 = "center";
                    } else {
                        str11 = "end";
                    }
                } else {
                    i14 = 2;
                    str11 = str2;
                }
                sb2.append("<span style='display:inline-block; text-align:" + str11 + str21);
                sb2.append(str10);
                sb2.append(str20);
            } else {
                i14 = 2;
                sb2.append(str10);
            }
            sb2.append("</span></div>");
            i27++;
            i17 = 1;
            i20 = i14;
            str15 = str15;
            str14 = str14;
            i18 = 0;
            gVar = this;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb6 = new StringBuilder("<html><head><style>");
        for (String str27 : map.keySet()) {
            sb6.append(str27);
            sb6.append("{");
            sb6.append((String) map.get(str27));
            sb6.append("}");
        }
        sb6.append("</style></head>");
        sb2.insert(0, sb6.toString());
        this.f19061c.loadData(Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f19062d.isEmpty()) {
            return;
        }
        c();
    }
}
