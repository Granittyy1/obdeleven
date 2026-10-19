package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import com.braze.support.BrazeLogger;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0872z {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f9048l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f9049m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9050a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9051b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9052c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9053d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9054e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f9055f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9056g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f9057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f9058i;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f9059k;

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$a */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = BrazeLogger.SUPPRESS;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$b */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class b extends d {
        @Override // androidx.appcompat.widget.C0872z.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0872z.e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$c */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class c extends b {
        @Override // androidx.appcompat.widget.C0872z.b, androidx.appcompat.widget.C0872z.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C0872z.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$d */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) C0872z.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
        }
    }

    public C0872z(TextView textView) {
        this.f9058i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9059k = new c();
        } else {
            this.f9059k = new b();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f9049m;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f9051b) {
                if (this.f9058i.getMeasuredHeight() <= 0 || this.f9058i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f9059k.b(this.f9058i) ? 1048576 : (this.f9058i.getMeasuredWidth() - this.f9058i.getTotalPaddingLeft()) - this.f9058i.getTotalPaddingRight();
                int height = (this.f9058i.getHeight() - this.f9058i.getCompoundPaddingBottom()) - this.f9058i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f9048l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f9058i.getTextSize()) {
                            g(fC, 0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f9051b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f9055f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f9055f[i13];
            TextView textView = this.f9058i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f9057h;
            if (textPaint == null) {
                this.f9057h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f9057h.set(textView.getPaint());
            this.f9057h.setTextSize(i14);
            StaticLayout staticLayoutA = a.a(text, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f9058i, this.f9057h, this.f9059k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == text.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f9055f[i11];
    }

    public final boolean f() {
        return j() && this.f9050a != 0;
    }

    public final void g(float f10, int i10) {
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f9058i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f9051b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f9050a == 1) {
            if (!this.f9056g || this.f9055f.length == 0) {
                int iFloor = ((int) Math.floor((this.f9054e - this.f9053d) / this.f9052c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f9052c) + this.f9053d);
                }
                this.f9055f = b(iArr);
            }
            this.f9051b = true;
        } else {
            this.f9051b = false;
        }
        return this.f9051b;
    }

    public final boolean i() {
        int[] iArr = this.f9055f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f9056g = z10;
        if (z10) {
            this.f9050a = 1;
            this.f9053d = iArr[0];
            this.f9054e = iArr[length - 1];
            this.f9052c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f9058i instanceof C0857j);
    }

    public final void k(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f9050a = 1;
        this.f9053d = f10;
        this.f9054e = f11;
        this.f9052c = f12;
        this.f9056g = false;
    }
}
