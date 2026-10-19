package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p114j1.k;
import p128k2.p;
import p128k2.q;

/* JADX INFO: compiled from: CanvasSubtitleOutput.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends View implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<p102i1.a> f18874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p128k2.a f18876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18877f;

    public a(Context context) {
        super(context, null);
        this.f18873b = new ArrayList();
        this.f18874c = Collections.emptyList();
        this.f18875d = 0.0533f;
        this.f18876e = p128k2.a.f41475g;
        this.f18877f = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List list, p128k2.a aVar, float f10, float f11) {
        this.f18874c = list;
        this.f18876e = aVar;
        this.f18875d = f10;
        this.f18877f = f11;
        while (true) {
            ArrayList arrayList = this.f18873b;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new p(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:201:0x04b7  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        TextPaint textPaint;
        int i15;
        int i16;
        Canvas canvas2;
        boolean z10;
        boolean z11;
        boolean z12;
        float f10;
        int i17;
        float f11;
        int i18;
        int iMax;
        int iMin;
        int iRound;
        a aVar = this;
        Canvas canvas3 = canvas;
        List<p102i1.a> list = aVar.f18874c;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i19 = paddingBottom - paddingTop;
        float fB = q.b(0, aVar.f18875d, height, i19);
        if (fB <= 0.0f) {
            return;
        }
        int size = list.size();
        int i20 = 0;
        while (i20 < size) {
            p102i1.a aVarA = list.get(i20);
            if (aVarA.f36525p != Integer.MIN_VALUE) {
                p102i1.a.C0382a c0382aA = aVarA.a();
                c0382aA.f36534h = -3.4028235E38f;
                c0382aA.f36535i = Integer.MIN_VALUE;
                c0382aA.f36529c = null;
                int i21 = aVarA.f36516f;
                float f12 = aVarA.f36515e;
                if (i21 == 0) {
                    c0382aA.f36531e = 1.0f - f12;
                    c0382aA.f36532f = 0;
                } else {
                    c0382aA.f36531e = (-f12) - 1.0f;
                    c0382aA.f36532f = 1;
                }
                int i22 = aVarA.f36517g;
                if (i22 == 0) {
                    c0382aA.f36533g = 2;
                } else if (i22 == 2) {
                    c0382aA.f36533g = 0;
                }
                aVarA = c0382aA.a();
            }
            float fB2 = q.b(aVarA.f36523n, aVarA.f36524o, height, i19);
            p pVar = (p) aVar.f18873b.get(i20);
            p128k2.a aVar2 = aVar.f18876e;
            List<p102i1.a> list2 = list;
            float f13 = aVar.f18877f;
            pVar.getClass();
            Bitmap bitmap = aVarA.f36514d;
            int i23 = height;
            int i24 = i19;
            boolean z13 = bitmap == null;
            CharSequence charSequence = aVarA.f36511a;
            if (z13) {
                if (TextUtils.isEmpty(charSequence)) {
                    canvas2 = canvas3;
                    i16 = paddingLeft;
                    i14 = paddingTop;
                    i13 = width;
                    i15 = paddingBottom;
                    i10 = size;
                    i12 = i20;
                } else {
                    i10 = size;
                    i11 = aVarA.f36521l ? aVarA.f36522m : aVar2.f41478c;
                }
                z11 = false;
                z12 = false;
                i20 = i12 + 1;
                canvas3 = canvas2;
                list = list2;
                height = i23;
                i19 = i24;
                size = i10;
                fB = fB;
                paddingBottom = i15;
                width = i13;
                paddingTop = i14;
                paddingLeft = i16;
                aVar = this;
            } else {
                i10 = size;
                i11 = -16777216;
            }
            i12 = i20;
            CharSequence charSequence2 = pVar.f41558i;
            TextPaint textPaint2 = pVar.f41555f;
            boolean z14 = z13;
            float f14 = aVarA.f36520k;
            int i25 = paddingBottom;
            float f15 = aVarA.j;
            i13 = width;
            int i26 = aVarA.f36519i;
            i14 = paddingTop;
            float f16 = aVarA.f36518h;
            int i27 = paddingLeft;
            int i28 = aVarA.f36517g;
            int i29 = aVarA.f36516f;
            float f17 = aVarA.f36515e;
            Layout.Alignment alignment = aVarA.f36512b;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(pVar.j, alignment) && pVar.f41559k == bitmap && pVar.f41560l == f17 && pVar.f41561m == i29) {
                if (Integer.valueOf(pVar.f41562n).equals(Integer.valueOf(i28)) && pVar.f41563o == f16 && Integer.valueOf(pVar.f41564p).equals(Integer.valueOf(i26)) && pVar.f41565q == f15 && pVar.f41566r == f14 && pVar.f41567s == aVar2.f41476a && pVar.f41568t == aVar2.f41477b && pVar.f41569u == i11 && pVar.f41571w == aVar2.f41479d && pVar.f41570v == aVar2.f41480e && Objects.equals(textPaint2.getTypeface(), aVar2.f41481f) && pVar.f41572x == fB && pVar.f41573y == fB2 && pVar.f41574z == f13) {
                    if (pVar.f41540A == i27) {
                        if (pVar.f41541B != i14) {
                            i14 = i14;
                        } else if (pVar.f41542C != i13) {
                            i14 = i14;
                            i13 = i13;
                        } else if (pVar.f41543D == i25) {
                            i14 = i14;
                            i13 = i13;
                            i15 = i25;
                            i16 = i27;
                            pVar.a(canvas, z14);
                            canvas2 = canvas;
                            z11 = false;
                            z12 = false;
                            i20 = i12 + 1;
                            canvas3 = canvas2;
                            list = list2;
                            height = i23;
                            i19 = i24;
                            size = i10;
                            fB = fB;
                            paddingBottom = i15;
                            width = i13;
                            paddingTop = i14;
                            paddingLeft = i16;
                            aVar = this;
                        } else {
                            i14 = i14;
                            i13 = i13;
                            i25 = i25;
                        }
                        i27 = i27;
                        textPaint = textPaint2;
                    } else {
                        i27 = i27;
                    }
                }
                textPaint = textPaint2;
            } else {
                textPaint = textPaint2;
            }
            pVar.f41558i = charSequence;
            pVar.j = alignment;
            pVar.f41559k = bitmap;
            pVar.f41560l = f17;
            pVar.f41561m = i29;
            pVar.f41562n = i28;
            pVar.f41563o = f16;
            pVar.f41564p = i26;
            pVar.f41565q = f15;
            pVar.f41566r = f14;
            pVar.f41567s = aVar2.f41476a;
            pVar.f41568t = aVar2.f41477b;
            pVar.f41569u = i11;
            pVar.f41571w = aVar2.f41479d;
            pVar.f41570v = aVar2.f41480e;
            textPaint.setTypeface(aVar2.f41481f);
            pVar.f41572x = fB;
            pVar.f41573y = fB2;
            pVar.f41574z = f13;
            int i30 = i27;
            pVar.f41540A = i30;
            i14 = i14;
            pVar.f41541B = i14;
            i13 = i13;
            pVar.f41542C = i13;
            i15 = i25;
            pVar.f41543D = i15;
            if (z14 != 0) {
                pVar.f41558i.getClass();
                CharSequence charSequence3 = pVar.f41558i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(pVar.f41558i);
                int i31 = pVar.f41542C - pVar.f41540A;
                int i32 = pVar.f41543D - pVar.f41541B;
                textPaint.setTextSize(pVar.f41572x);
                int i33 = (int) ((pVar.f41572x * 0.125f) + 0.5f);
                int i34 = i33 * 2;
                int i35 = i31 - i34;
                float f18 = pVar.f41565q;
                if (f18 != -3.4028235E38f) {
                    i35 = (int) (i35 * f18);
                }
                if (i35 <= 0) {
                    k.f("Skipped drawing subtitle cue (insufficient space)");
                    i16 = i30;
                    z10 = z14;
                    i14 = i14;
                    i15 = i15;
                    i13 = i13;
                    fB = fB;
                } else {
                    i16 = i30;
                    if (pVar.f41573y > 0.0f) {
                        i18 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) pVar.f41573y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i18 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (pVar.f41571w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i18, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i36 = 0;
                        for (int length = foregroundColorSpanArr.length; i36 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i36]);
                            i36++;
                        }
                    }
                    if (Color.alpha(pVar.f41568t) > 0) {
                        int i37 = pVar.f41571w;
                        if (i37 == 0 || i37 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(pVar.f41568t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(pVar.f41568t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = pVar.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i35, alignment2, pVar.f41553d, pVar.f41554e, true);
                    pVar.f41544E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = pVar.f41544E.getLineCount();
                    fB = fB;
                    int iMax2 = 0;
                    int i38 = 0;
                    while (i38 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(pVar.f41544E.getLineWidth(i38)), iMax2);
                        i38++;
                        lineCount = lineCount;
                        z14 = z14;
                    }
                    z10 = z14;
                    if (pVar.f41565q == -3.4028235E38f || iMax2 >= i35) {
                        i35 = iMax2;
                    }
                    int i39 = i35 + i34;
                    float f19 = pVar.f41563o;
                    if (f19 != -3.4028235E38f) {
                        int iRound2 = Math.round(i31 * f19);
                        int i40 = pVar.f41540A;
                        int i41 = iRound2 + i40;
                        int i42 = pVar.f41564p;
                        if (i42 == 1) {
                            i41 = ((i41 * 2) - i39) / 2;
                        } else if (i42 == 2) {
                            i41 -= i39;
                        }
                        iMax = Math.max(i41, i40);
                        iMin = Math.min(i39 + iMax, pVar.f41542C);
                    } else {
                        iMax = pVar.f41540A + ((i31 - i39) / 2);
                        iMin = iMax + i39;
                    }
                    int i43 = iMin - iMax;
                    if (i43 <= 0) {
                        k.f("Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f20 = pVar.f41560l;
                        if (f20 != -3.4028235E38f) {
                            if (pVar.f41561m == 0) {
                                iRound = Math.round(i32 * f20) + pVar.f41541B;
                                int i44 = pVar.f41562n;
                                if (i44 == 2) {
                                    iRound -= height2;
                                } else if (i44 == 1) {
                                    iRound = ((iRound * 2) - height2) / 2;
                                }
                                z11 = false;
                                z12 = false;
                            } else {
                                z11 = false;
                                int lineBottom = pVar.f41544E.getLineBottom(0) - pVar.f41544E.getLineTop(0);
                                float f21 = pVar.f41560l;
                                z12 = false;
                                iRound = f21 >= 0.0f ? Math.round(f21 * lineBottom) + pVar.f41541B : (Math.round((f21 + 1.0f) * lineBottom) + pVar.f41543D) - height2;
                            }
                            int i45 = iRound + height2;
                            int i46 = pVar.f41543D;
                            if (i45 > i46) {
                                iRound = i46 - height2;
                            } else {
                                int i47 = pVar.f41541B;
                                if (iRound < i47) {
                                    iRound = i47;
                                }
                            }
                        } else {
                            z11 = false;
                            z12 = false;
                            iRound = (pVar.f41543D - height2) - ((int) (i32 * pVar.f41574z));
                        }
                        TextPaint textPaint3 = textPaint;
                        Layout.Alignment alignment3 = alignment2;
                        pVar.f41544E = new StaticLayout(spannableStringBuilder, textPaint3, i43, alignment3, pVar.f41553d, pVar.f41554e, true);
                        pVar.f41545F = new StaticLayout(spannableStringBuilder2, textPaint3, i43, alignment3, pVar.f41553d, pVar.f41554e, true);
                        pVar.f41546G = iMax;
                        pVar.f41547H = iRound;
                        pVar.f41548I = i33;
                    }
                }
                z11 = false;
                z12 = false;
            } else {
                i16 = i30;
                z10 = z14;
                i14 = i14;
                i15 = i15;
                i13 = i13;
                fB = fB;
                z11 = false;
                z12 = false;
                pVar.f41559k.getClass();
                Bitmap bitmap2 = pVar.f41559k;
                int i48 = pVar.f41542C;
                int i49 = pVar.f41540A;
                int i50 = pVar.f41543D;
                int i51 = pVar.f41541B;
                float f22 = i48 - i49;
                float f23 = (pVar.f41563o * f22) + i49;
                float f24 = i50 - i51;
                float f25 = (pVar.f41560l * f24) + i51;
                int iRound3 = Math.round(f22 * pVar.f41565q);
                float f26 = pVar.f41566r;
                int iRound4 = f26 != -3.4028235E38f ? Math.round(f24 * f26) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i52 = pVar.f41564p;
                if (i52 == 2) {
                    f10 = iRound3;
                } else {
                    if (i52 == 1) {
                        f10 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f23);
                    i17 = pVar.f41562n;
                    if (i17 == 2) {
                        f11 = iRound4;
                    } else {
                        if (i17 == 1) {
                            f11 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f25);
                        pVar.f41549J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f25 -= f11;
                    int iRound7 = Math.round(f25);
                    pVar.f41549J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f23 -= f10;
                int iRound8 = Math.round(f23);
                i17 = pVar.f41562n;
                if (i17 == 2) {
                    f11 = iRound4;
                } else {
                    if (i17 == 1) {
                        f11 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f25);
                    pVar.f41549J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f25 -= f11;
                int iRound10 = Math.round(f25);
                pVar.f41549J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            canvas2 = canvas;
            pVar.a(canvas2, z10);
            i20 = i12 + 1;
            canvas3 = canvas2;
            list = list2;
            height = i23;
            i19 = i24;
            size = i10;
            fB = fB;
            paddingBottom = i15;
            width = i13;
            paddingTop = i14;
            paddingLeft = i16;
            aVar = this;
        }
    }
}
