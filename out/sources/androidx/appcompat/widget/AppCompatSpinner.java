package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0852e f8638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0867u f8640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f8641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f8642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f8643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f8645i;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (!appCompatSpinner.getInternalPopup().b()) {
                appCompatSpinner.f8643g.m(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
            }
            ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public static final class b {
        public static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    public class c implements g, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.app.e f8647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f8648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f8649d;

        public c() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final boolean b() {
            androidx.appcompat.app.e eVar = this.f8647b;
            if (eVar != null) {
                return eVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void dismiss() {
            androidx.appcompat.app.e eVar = this.f8647b;
            if (eVar != null) {
                eVar.dismiss();
                this.f8647b = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void e(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final CharSequence f() {
            return this.f8649d;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void h(CharSequence charSequence) {
            this.f8649d = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void i(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void m(int i10, int i11) {
            if (this.f8648c == null) {
                return;
            }
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(appCompatSpinner.getPopupContext());
            CharSequence charSequence = this.f8649d;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.e eVarCreate = aVar.setSingleChoiceItems(this.f8648c, appCompatSpinner.getSelectedItemPosition(), this).create();
            this.f8647b = eVarCreate;
            AlertController.RecycleListView recycleListView = eVarCreate.f8370g.f8297g;
            recycleListView.setTextDirection(i10);
            recycleListView.setTextAlignment(i11);
            this.f8647b.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final int n() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            appCompatSpinner.setSelection(i10);
            if (appCompatSpinner.getOnItemClickListener() != null) {
                appCompatSpinner.performItemClick(null, i10, this.f8648c.getItemId(i10));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void p(ListAdapter listAdapter) {
            this.f8648c = (d) listAdapter;
        }
    }

    public static class d implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SpinnerAdapter f8651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ListAdapter f8652c;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f8652c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.f8651b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f8651b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f8651b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f8651b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f8651b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f8652c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8651b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8651b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class e extends J implements g {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public CharSequence f8653D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public d f8654E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public final Rect f8655F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f8656G;

        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
                e eVar = e.this;
                AppCompatSpinner.this.setSelection(i10);
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                if (appCompatSpinner.getOnItemClickListener() != null) {
                    appCompatSpinner.performItemClick(view, i10, eVar.f8654E.getItemId(i10));
                }
                eVar.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e eVar = e.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                eVar.getClass();
                if (!appCompatSpinner.isAttachedToWindow() || !appCompatSpinner.getGlobalVisibleRect(eVar.f8655F)) {
                    eVar.dismiss();
                } else {
                    eVar.s();
                    eVar.a();
                }
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f8660b;

            public c(b bVar) {
                this.f8660b = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f8660b);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f8655F = new Rect();
            this.f8735p = AppCompatSpinner.this;
            this.f8745z = true;
            this.f8721A.setFocusable(true);
            this.f8736q = new a();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final CharSequence f() {
            return this.f8653D;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void h(CharSequence charSequence) {
            this.f8653D = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void l(int i10) {
            this.f8656G = i10;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.g
        public final void m(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            C0862o c0862o = this.f8721A;
            boolean zIsShowing = c0862o.isShowing();
            s();
            this.f8721A.setInputMethodMode(2);
            a();
            E e10 = this.f8724d;
            e10.setChoiceMode(1);
            e10.setTextDirection(i10);
            e10.setTextAlignment(i11);
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
            E e11 = this.f8724d;
            if (c0862o.isShowing() && e11 != null) {
                e11.setListSelectionHidden(false);
                e11.setSelection(selectedItemPosition);
                if (e11.getChoiceMode() != 0) {
                    e11.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f8721A.setOnDismissListener(new c(bVar));
        }

        @Override // androidx.appcompat.widget.J, androidx.appcompat.widget.AppCompatSpinner.g
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.f8654E = (d) listAdapter;
        }

        public final void s() {
            int i10;
            C0862o c0862o = this.f8721A;
            Drawable background = c0862o.getBackground();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            if (background != null) {
                background.getPadding(appCompatSpinner.f8645i);
                boolean z10 = k0.f8999a;
                int layoutDirection = appCompatSpinner.getLayoutDirection();
                Rect rect = appCompatSpinner.f8645i;
                i10 = layoutDirection == 1 ? rect.right : -rect.left;
            } else {
                Rect rect2 = appCompatSpinner.f8645i;
                rect2.right = 0;
                rect2.left = 0;
                i10 = 0;
            }
            int paddingLeft = appCompatSpinner.getPaddingLeft();
            int paddingRight = appCompatSpinner.getPaddingRight();
            int width = appCompatSpinner.getWidth();
            int i11 = appCompatSpinner.f8644h;
            if (i11 == -2) {
                int iA = appCompatSpinner.a(this.f8654E, c0862o.getBackground());
                int i12 = appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = appCompatSpinner.f8645i;
                int i13 = (i12 - rect3.left) - rect3.right;
                if (iA > i13) {
                    iA = i13;
                }
                r(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i11);
            }
            boolean z11 = k0.f8999a;
            this.f8727g = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f8726f) - this.f8656G) + i10 : paddingLeft + this.f8656G + i10;
        }
    }

    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f8662b;

        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            public final f createFromParcel(Parcel parcel) {
                f fVar = new f(parcel);
                fVar.f8662b = parcel.readByte() != 0;
                return fVar;
            }

            @Override // android.os.Parcelable.Creator
            public final f[] newArray(int i10) {
                return new f[i10];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f8662b ? (byte) 1 : (byte) 0);
        }
    }

    public interface g {
        boolean b();

        int c();

        void dismiss();

        void e(int i10);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void k(int i10);

        void l(int i10);

        void m(int i10, int i11);

        int n();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.voltasit.obdeleven.R.attr.spinnerStyle);
        this.f8645i = new Rect();
        X.a(this, getContext());
        int[] iArr = p088h.a.f35710w;
        c0 c0VarF = c0.f(context, attributeSet, iArr, com.voltasit.obdeleven.R.attr.spinnerStyle, 0);
        this.f8638b = new C0852e(this);
        TypedArray typedArray = c0VarF.f8929b;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f8639c = new p138l.c(context, resourceId);
        } else {
            this.f8639c = context;
        }
        int i10 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j, com.voltasit.obdeleven.R.attr.spinnerStyle, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i10 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i10 != 0) {
                    c cVar = new c();
                    this.f8643g = cVar;
                    cVar.f8649d = typedArray.getString(2);
                } else if (i10 == 1) {
                    e eVar = new e(this.f8639c, attributeSet, com.voltasit.obdeleven.R.attr.spinnerStyle);
                    c0 c0VarF2 = c0.f(this.f8639c, attributeSet, iArr, com.voltasit.obdeleven.R.attr.spinnerStyle, 0);
                    this.f8644h = c0VarF2.f8929b.getLayoutDimension(3, -2);
                    eVar.i(c0VarF2.b(1));
                    eVar.f8653D = typedArray.getString(2);
                    c0VarF2.g();
                    this.f8643g = eVar;
                    this.f8640d = new C0867u(this, this, eVar);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.voltasit.obdeleven.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                c0VarF.g();
                this.f8642f = true;
                spinnerAdapter = this.f8641e;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.f8641e = null;
                }
                this.f8638b.d(attributeSet, com.voltasit.obdeleven.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i10 != 0) {
            c cVar2 = new c();
            this.f8643g = cVar2;
            cVar2.f8649d = typedArray.getString(2);
        } else if (i10 == 1) {
            e eVar2 = new e(this.f8639c, attributeSet, com.voltasit.obdeleven.R.attr.spinnerStyle);
            c0 c0VarF3 = c0.f(this.f8639c, attributeSet, iArr, com.voltasit.obdeleven.R.attr.spinnerStyle, 0);
            this.f8644h = c0VarF3.f8929b.getLayoutDimension(3, -2);
            eVar2.i(c0VarF3.b(1));
            eVar2.f8653D = typedArray.getString(2);
            c0VarF3.g();
            this.f8643g = eVar2;
            this.f8640d = new C0867u(this, this, eVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.voltasit.obdeleven.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        c0VarF.g();
        this.f8642f = true;
        spinnerAdapter = this.f8641e;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f8641e = null;
        }
        this.f8638b.d(attributeSet, com.voltasit.obdeleven.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f8645i;
        drawable.getPadding(rect);
        return iMax2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0852e c0852e = this.f8638b;
        if (c0852e != null) {
            c0852e.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.f8643g;
        return gVar != null ? gVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.f8643g;
        return gVar != null ? gVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8643g != null ? this.f8644h : super.getDropDownWidth();
    }

    public final g getInternalPopup() {
        return this.f8643g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.f8643g;
        return gVar != null ? gVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8639c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.f8643g;
        return gVar != null ? gVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0852e c0852e = this.f8638b;
        if (c0852e != null) {
            return c0852e.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0852e c0852e = this.f8638b;
        if (c0852e != null) {
            return c0852e.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.f8643g;
        if (gVar == null || !gVar.b()) {
            return;
        }
        gVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f8643g == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f8662b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.f8643g;
        fVar.f8662b = gVar != null && gVar.b();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0867u c0867u = this.f8640d;
        if (c0867u == null || !c0867u.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        g gVar = this.f8643g;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.b()) {
            return true;
        }
        this.f8643g.m(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0852e c0852e = this.f8638b;
        if (c0852e != null) {
            c0852e.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0852e c0852e = this.f8638b;
        if (c0852e != null) {
            c0852e.f(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        g gVar = this.f8643g;
        if (gVar == null) {
            super.setDropDownHorizontalOffset(i10);
        } else {
            gVar.l(i10);
            gVar.e(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        g gVar = this.f8643g;
        if (gVar != null) {
            gVar.k(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f8643g != null) {
            this.f8644h = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.f8643g;
        if (gVar != null) {
            gVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(com.voltasit.obdeleven.domain.usecases.device.v.e(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.f8643g;
        if (gVar != null) {
            gVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0852e c0852e = this.f8638b;
        if (c0852e != null) {
            c0852e.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0852e c0852e = this.f8638b;
        if (c0852e != null) {
            c0852e.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8642f) {
            this.f8641e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        g gVar = this.f8643g;
        if (gVar != null) {
            Context context = this.f8639c;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            d dVar = new d();
            dVar.f8651b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                dVar.f8652c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    b.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof Y) {
                    Y y10 = (Y) spinnerAdapter;
                    if (y10.getDropDownViewTheme() == null) {
                        y10.a();
                    }
                }
            }
            gVar.p(dVar);
        }
    }
}
