package P5;

import C.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* JADX INFO: compiled from: TextAppearance.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f4932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f4936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f4937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f4938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4940i;
    public final ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f4941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4943m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f4944n;

    /* JADX INFO: compiled from: TextAppearance.java */
    public class a extends r0.f.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f4945a;

        public a(g gVar) {
            this.f4945a = gVar;
        }

        @Override // r0.f.e
        public final void b(int i10) {
            d.this.f4943m = true;
            this.f4945a.Z(i10);
        }

        @Override // r0.f.e
        public final void c(Typeface typeface) {
            d dVar = d.this;
            dVar.f4944n = Typeface.create(typeface, dVar.f4934c);
            dVar.f4943m = true;
            this.f4945a.a0(dVar.f4944n, false);
        }
    }

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, p204q5.a.f46104H);
        this.f4941k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.j = c.a(context, typedArrayObtainStyledAttributes, 3);
        c.a(context, typedArrayObtainStyledAttributes, 4);
        c.a(context, typedArrayObtainStyledAttributes, 5);
        this.f4934c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f4935d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f4942l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f4933b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f4932a = c.a(context, typedArrayObtainStyledAttributes, 6);
        this.f4936e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f4937f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f4938g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, p204q5.a.f46128v);
        this.f4939h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f4940i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f4944n;
        int i10 = this.f4934c;
        if (typeface == null && (str = this.f4933b) != null) {
            this.f4944n = Typeface.create(str, i10);
        }
        if (this.f4944n == null) {
            int i11 = this.f4935d;
            if (i11 == 1) {
                this.f4944n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f4944n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f4944n = Typeface.DEFAULT;
            } else {
                this.f4944n = Typeface.MONOSPACE;
            }
            this.f4944n = Typeface.create(this.f4944n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f4943m) {
            return this.f4944n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = p211r0.f.a(context, this.f4942l);
                this.f4944n = typefaceA;
                if (typefaceA != null) {
                    this.f4944n = Typeface.create(typefaceA, this.f4934c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f4943m = true;
        return this.f4944n;
    }

    public final void c(Context context, g gVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f4942l;
        if (i10 == 0) {
            this.f4943m = true;
        }
        if (this.f4943m) {
            gVar.a0(this.f4944n, true);
            return;
        }
        try {
            a aVar = new a(gVar);
            ThreadLocal<TypedValue> threadLocal = p211r0.f.f46248a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                p211r0.f.b(context, i10, new TypedValue(), 0, aVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f4943m = true;
            gVar.Z(1);
        } catch (Exception unused2) {
            this.f4943m = true;
            gVar.Z(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceB = null;
        int i10 = this.f4942l;
        if (i10 != 0) {
            ThreadLocal<TypedValue> threadLocal = p211r0.f.f46248a;
            if (!context.isRestricted()) {
                typefaceB = p211r0.f.b(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, g gVar) {
        f(context, textPaint, gVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f4932a;
        textPaint.setShadowLayer(this.f4938g, this.f4936e, this.f4937f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, g gVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f4944n);
        c(context, new e(this, context, textPaint, gVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = f.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f4934c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4941k);
        if (this.f4939h) {
            textPaint.setLetterSpacing(this.f4940i);
        }
    }
}
