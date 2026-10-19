package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: AppCompatCheckedTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0854g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatCheckedTextView f8949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f8950b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8951c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8952d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8953e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8954f;

    public C0854g(AppCompatCheckedTextView appCompatCheckedTextView) {
        this.f8949a = appCompatCheckedTextView;
    }

    public final void a() {
        AppCompatCheckedTextView appCompatCheckedTextView = this.f8949a;
        Drawable checkMarkDrawable = appCompatCheckedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f8952d || this.f8953e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f8952d) {
                    p234t0.a.C0532a.h(drawableMutate, this.f8950b);
                }
                if (this.f8953e) {
                    p234t0.a.C0532a.i(drawableMutate, this.f8951c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(appCompatCheckedTextView.getDrawableState());
                }
                appCompatCheckedTextView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
