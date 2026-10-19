package E2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.collection.C0873a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p211r0.j;

/* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends f implements Animatable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f2977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f2978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<E2.c> f2979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f2980g;

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            d.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            d.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            d.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f2982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AnimatorSet f2983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f2984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C0873a<Animator, String> f2985d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public d(Context context) {
        this.f2978e = null;
        this.f2979f = null;
        this.f2980g = new a();
        this.f2977d = context;
        this.f2976c = new b();
    }

    @Override // E2.f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.C0532a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            return p234t0.a.C0532a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f2976c;
        bVar.f2982a.draw(canvas);
        if (bVar.f2983b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getAlpha() : this.f2976c.f2982a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2976c.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f2988b;
        return drawable != null ? p234t0.a.C0532a.c(drawable) : this.f2976c.f2982a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f2988b != null) {
            return new c(this.f2988b.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2976c.f2982a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2976c.f2982a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.getOpacity() : this.f2976c.f2982a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        b bVar;
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.C0532a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f2976c;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayF = j.f(resources, theme, attributeSet, E2.a.f2972e);
                    int resourceId = typedArrayF.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g gVar = new g();
                        ThreadLocal<TypedValue> threadLocal = p211r0.f.f46248a;
                        gVar.f2988b = r0.f.a.a(resources, resourceId, theme);
                        new g.h(gVar.f2988b.getConstantState());
                        gVar.f2994g = false;
                        gVar.setCallback(this.f2980g);
                        g gVar2 = bVar.f2982a;
                        if (gVar2 != null) {
                            gVar2.setCallback(null);
                        }
                        bVar.f2982a = gVar;
                    }
                    typedArrayF.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, E2.a.f2973f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2977d;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(bVar.f2982a.f2990c.f3036b.f3034o.get(string));
                        if (bVar.f2984c == null) {
                            bVar.f2984c = new ArrayList<>();
                            bVar.f2985d = new C0873a<>();
                        }
                        bVar.f2984c.add(animatorLoadAnimator);
                        bVar.f2985d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (bVar.f2983b == null) {
            bVar.f2983b = new AnimatorSet();
        }
        bVar.f2983b.playTogether(bVar.f2984c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.isAutoMirrored() : this.f2976c.f2982a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f2988b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2976c.f2983b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.isStateful() : this.f2976c.f2982a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2976c.f2982a.setBounds(rect);
        }
    }

    @Override // E2.f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.setLevel(i10) : this.f2976c.f2982a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2988b;
        return drawable != null ? drawable.setState(iArr) : this.f2976c.f2982a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f2976c.f2982a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f2976c.f2982a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2976c.f2982a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.a(drawable, i10);
        } else {
            this.f2976c.f2982a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.C0532a.h(drawable, colorStateList);
        } else {
            this.f2976c.f2982a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            p234t0.a.C0532a.i(drawable, mode);
        } else {
            this.f2976c.f2982a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f2976c.f2982a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f2976c;
        if (bVar.f2983b.isStarted()) {
            return;
        }
        bVar.f2983b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f2988b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2976c.f2983b.end();
        }
    }

    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f2986a;

        public c(Drawable.ConstantState constantState) {
            this.f2986a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f2986a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f2986a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f2986a.newDrawable();
            dVar.f2988b = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f2980g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f2986a.newDrawable(resources);
            dVar.f2988b = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f2980g);
            return dVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            d dVar = new d();
            Drawable drawableNewDrawable = this.f2986a.newDrawable(resources, theme);
            dVar.f2988b = drawableNewDrawable;
            drawableNewDrawable.setCallback(dVar.f2980g);
            return dVar;
        }
    }

    public d() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
