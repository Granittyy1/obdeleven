package F5;

import K5.o;
import S5.f;
import S5.i;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.e;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.g;
import java.util.WeakHashMap;
import p138l.c;

/* JADX INFO: compiled from: MaterialAlertDialogBuilder.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f3256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f3257b;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i10) {
        int i11;
        TypedValue typedValueA = P5.b.a(context, R.attr.materialAlertDialogTheme);
        int i12 = typedValueA == null ? 0 : typedValueA.data;
        Context contextA = Z5.a.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextA = i12 != 0 ? new c(contextA, i12) : contextA;
        if (i10 == 0) {
            TypedValue typedValueA2 = P5.b.a(context, R.attr.materialAlertDialogTheme);
            i11 = typedValueA2 == null ? 0 : typedValueA2.data;
        } else {
            i11 = i10;
        }
        super(contextA, i11);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int[] iArr = p204q5.a.f46119m;
        o.a(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        o.b(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        this.f3257b = new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
        TypedValue typedValueC = P5.b.c(context2, getClass().getCanonicalName(), R.attr.colorSurface);
        int i13 = typedValueC.resourceId;
        int iA = i13 != 0 ? p0.a.b.a(context2, i13) : typedValueC.data;
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iA);
        typedArrayObtainStyledAttributes2.recycle();
        f fVar = new f(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        fVar.i(context2);
        fVar.k(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                i.a aVarE = fVar.f5566b.f5589a.e();
                aVarE.e(dimension);
                aVarE.f(dimension);
                aVarE.d(dimension);
                aVarE.c(dimension);
                fVar.setShapeAppearanceModel(aVarE.a());
            }
        }
        this.f3256a = fVar;
    }

    public final b a() {
        return (b) super.setCancelable(false);
    }

    public final b b(int i10) {
        return (b) super.setMessage(i10);
    }

    public final b c(String str) {
        return (b) super.setMessage(str);
    }

    @Override // androidx.appcompat.app.e.a
    public final e create() {
        e eVarCreate = super.create();
        Window window = eVarCreate.getWindow();
        View decorView = window.getDecorView();
        f fVar = this.f3256a;
        if (fVar != null) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            fVar.j(O.d.i(decorView));
        }
        Rect rect = this.f3257b;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) fVar, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new a(eVarCreate, rect));
        return eVarCreate;
    }

    public final b d(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i10, onClickListener);
    }

    public final b e(String str, g gVar) {
        return (b) super.setNegativeButton(str, gVar);
    }

    public final b f(com.voltasit.obdeleven.presentation.dialogs.sfd.b bVar) {
        return (b) super.setNeutralButton(R.string.common_learn_more, bVar);
    }

    public final b g(String str, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(str, onClickListener);
    }

    public final b h(com.voltasit.obdeleven.ui.activity.i iVar) {
        return (b) super.setOnCancelListener(iVar);
    }

    public final b i(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i10, onClickListener);
    }

    public final b j(String str, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(str, onClickListener);
    }

    public final b k(int i10) {
        return (b) super.setTitle(i10);
    }

    public final b l(String str) {
        return (b) super.setTitle(str);
    }

    public final b m(ComposeView composeView) {
        return (b) super.setView(composeView);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setCancelable(boolean z10) {
        return (b) super.setCancelable(z10);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (b) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setCustomTitle(View view) {
        return (b) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setIcon(int i10) {
        return (b) super.setIcon(i10);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setIconAttribute(int i10) {
        return (b) super.setIconAttribute(i10);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setItems(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setItems(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setMessage(int i10) {
        return (b) super.setMessage(i10);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setMultiChoiceItems(int i10, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(i10, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setNegativeButtonIcon(Drawable drawable) {
        return (b) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setNeutralButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setNeutralButtonIcon(Drawable drawable) {
        return (b) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setPositiveButtonIcon(Drawable drawable) {
        return (b) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setSingleChoiceItems(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(i10, i11, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setTitle(int i10) {
        return (b) super.setTitle(i10);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setView(int i10) {
        return (b) super.setView(i10);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setIcon(Drawable drawable) {
        return (b) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setMessage(CharSequence charSequence) {
        return (b) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setSingleChoiceItems(Cursor cursor, int i10, String str, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(cursor, i10, str, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setTitle(CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setView(View view) {
        return (b) super.setView(view);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setSingleChoiceItems(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(charSequenceArr, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.e.a
    public final e.a setSingleChoiceItems(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setSingleChoiceItems(listAdapter, i10, onClickListener);
    }
}
