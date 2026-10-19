package androidx.cardview.widget;

import O.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p221s.b;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f9062g = {R.attr.colorBackground};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f9063h = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f9066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f9067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f9068f;

    public class a implements p221s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f9069a;

        public a() {
        }

        public final void a(int i10, int i11, int i12, int i13) {
            CardView cardView = CardView.this;
            cardView.f9067e.set(i10, i11, i12, i13);
            Rect rect = cardView.f9066d;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.voltasit.obdeleven.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f9066d = rect;
        this.f9067e = new Rect();
        a aVar = new a();
        this.f9068f = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p210r.a.f46222a, com.voltasit.obdeleven.R.attr.cardViewStyle, com.voltasit.obdeleven.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f9062g);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.voltasit.obdeleven.R.color.cardview_light_background) : getResources().getColor(com.voltasit.obdeleven.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f9064b = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f9065c = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        h hVar = f9063h;
        b bVar = new b(colorStateListValueOf, dimension);
        aVar.f9069a = bVar;
        setBackgroundDrawable(bVar);
        setClipToOutline(true);
        setElevation(dimension2);
        hVar.l(aVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((b) this.f9068f.f9069a).f46845h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f9066d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f9066d.left;
    }

    public int getContentPaddingRight() {
        return this.f9066d.right;
    }

    public int getContentPaddingTop() {
        return this.f9066d.top;
    }

    public float getMaxCardElevation() {
        return ((b) this.f9068f.f9069a).f46842e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f9065c;
    }

    public float getRadius() {
        return ((b) this.f9068f.f9069a).f46838a;
    }

    public boolean getUseCompatPadding() {
        return this.f9064b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        b bVarH = h.h(this.f9068f);
        if (colorStateList == null) {
            bVarH.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        bVarH.f46845h = colorStateList;
        bVarH.f46839b.setColor(colorStateList.getColorForState(bVarH.getState(), bVarH.f46845h.getDefaultColor()));
        bVarH.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        CardView.this.setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f9063h.l(this.f9068f, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f9065c) {
            this.f9065c = z10;
            h hVar = f9063h;
            a aVar = this.f9068f;
            hVar.l(aVar, ((b) aVar.f9069a).f46842e);
        }
    }

    public void setRadius(float f10) {
        b bVar = (b) this.f9068f.f9069a;
        if (f10 == bVar.f46838a) {
            return;
        }
        bVar.f46838a = f10;
        bVar.b(null);
        bVar.invalidateSelf();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setUseCompatPadding(boolean z10) {
        if (this.f9064b != z10) {
            this.f9064b = z10;
            h hVar = f9063h;
            a aVar = this.f9068f;
            hVar.l(aVar, ((b) aVar.f9069a).f46842e);
        }
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        b bVarH = h.h(this.f9068f);
        if (colorStateListValueOf == null) {
            bVarH.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        bVarH.f46845h = colorStateListValueOf;
        bVarH.f46839b.setColor(colorStateListValueOf.getColorForState(bVarH.getState(), bVarH.f46845h.getDefaultColor()));
        bVarH.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}
