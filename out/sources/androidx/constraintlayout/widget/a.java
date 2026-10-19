package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: ConstraintHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f16474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p089h0.b f16475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View[] f16478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HashMap<Integer, String> f16479i;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16472b = new int[32];
        this.f16478h = null;
        this.f16479i = new HashMap<>();
        this.f16474d = context;
        h(attributeSet);
    }

    public final void a(String str) {
        String strTrim;
        int iG;
        if (str == null || str.length() == 0 || this.f16474d == null || (iG = g((strTrim = str.trim()))) == 0) {
            return;
        }
        this.f16479i.put(Integer.valueOf(iG), strTrim);
        b(iG);
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f16473c + 1;
        int[] iArr = this.f16472b;
        if (i11 > iArr.length) {
            this.f16472b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f16472b;
        int i12 = this.f16473c;
        iArr2[i12] = i10;
        this.f16473c = i12 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f16474d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && strTrim.equals(((ConstraintLayout.a) layoutParams).f16419Y) && childAt.getId() != -1) {
                b(childAt.getId());
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f16473c; i10++) {
            View viewC = constraintLayout.c(this.f16472b[i10]);
            if (viewC != null) {
                viewC.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewC.setTranslationZ(viewC.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f16474d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final int g(String str) {
        int iF;
        HashMap<String, Integer> map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iF = 0;
        } else {
            Integer num = (str == null || (map = constraintLayout.f16392n) == null || !map.containsKey(str)) ? null : constraintLayout.f16392n.get(str);
            if (num instanceof Integer) {
                iF = num.intValue();
            } else {
                iF = 0;
            }
        }
        if (iF == 0 && constraintLayout != null) {
            iF = f(constraintLayout, str);
        }
        if (iF == 0) {
            try {
                iF = p139l0.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iF != 0) {
            return iF;
        }
        Context context = this.f16474d;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f16472b, this.f16473c);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p139l0.d.f44124b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f16476f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f16477g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void i(b.a aVar, p089h0.b bVar, c.a aVar2, SparseArray sparseArray) {
        b.C0170b c0170b = aVar.f16493e;
        int[] iArr = c0170b.f16553j0;
        int i10 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c0170b.f16555k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = c0170b.f16555k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i11 = 0;
                    for (String str2 : strArrSplit) {
                        int iG = g(str2.trim());
                        if (iG != 0) {
                            iArrCopyOf[i11] = iG;
                            i11++;
                        }
                    }
                    if (i11 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
                    }
                    c0170b.f16553j0 = iArrCopyOf;
                } else {
                    c0170b.f16553j0 = null;
                }
            }
        }
        bVar.a();
        if (c0170b.f16553j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = c0170b.f16553j0;
            if (i10 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i10]);
            if (constraintWidget != null) {
                bVar.b(constraintWidget);
            }
            i10++;
        }
    }

    public final void k() {
        if (this.f16475e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f16453q0 = this.f16475e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f16476f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f16477g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f16476f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f16473c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f16477g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f16473c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f16476f = null;
        this.f16473c = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public final void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f16476f == null) {
            b(i10);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void j(ConstraintWidget constraintWidget, boolean z10) {
    }
}
