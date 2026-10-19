package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.O;

/* JADX INFO: loaded from: classes3.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f27236h = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f27239g;

    public static class a extends K0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0272a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27240d;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a$a, reason: collision with other inner class name */
        public class C0272a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27240d = parcel.readInt() == 1;
        }

        @Override // K0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f27240d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.voltasit.obdeleven.R.attr.imageButtonStyle);
        this.f27238f = true;
        this.f27239g = true;
        O.n(this, new K5.a(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f27237e;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        return this.f27237e ? View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), f27236h) : super.onCreateDrawableState(i10);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f4135b);
        setChecked(aVar.f27240d);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f27240d = this.f27237e;
        return aVar;
    }

    public void setCheckable(boolean z10) {
        if (this.f27238f != z10) {
            this.f27238f = z10;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (!this.f27238f || this.f27237e == z10) {
            return;
        }
        this.f27237e = z10;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z10) {
        this.f27239g = z10;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (this.f27239g) {
            super.setPressed(z10);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f27237e);
    }
}
