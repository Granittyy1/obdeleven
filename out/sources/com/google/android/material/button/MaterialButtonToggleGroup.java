package com.google.android.material.button;

import B0.s;
import K5.o;
import K5.t;
import S5.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.C1286a;
import androidx.core.view.O;
import androidx.core.view.Z;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f26858l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f26860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<d> f26861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f26862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer[] f26863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f26864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26865h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26866i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HashSet f26867k;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.f26854p).compareTo(Boolean.valueOf(materialButton4.f26854p));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class b extends C1286a {
        public b() {
        }

        @Override // androidx.core.view.C1286a
        public final void onInitializeAccessibilityNodeInfo(View view, s sVar) {
            int i10;
            super.onInitializeAccessibilityNodeInfo(view, sVar);
            int i11 = MaterialButtonToggleGroup.f26858l;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i12 = 0;
                for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                    if (materialButtonToggleGroup.getChildAt(i13) == view) {
                        i10 = i12;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.c(i13)) {
                            i12++;
                        }
                    }
                }
                i10 = -1;
            } else {
                i10 = -1;
            }
            sVar.l(s.f.a(0, 1, i10, 1, false, ((MaterialButton) view).f26854p));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final S5.a f26870e = new S5.a(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S5.c f26871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S5.c f26872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final S5.c f26873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final S5.c f26874d;

        public c(S5.c cVar, S5.c cVar2, S5.c cVar3, S5.c cVar4) {
            this.f26871a = cVar;
            this.f26872b = cVar3;
            this.f26873c = cVar4;
            this.f26874d = cVar2;
        }
    }

    public interface d {
        void a();
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(Z5.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f26859b = new ArrayList();
        this.f26860c = new e();
        this.f26861d = new LinkedHashSet<>();
        this.f26862e = new a();
        this.f26864g = false;
        this.f26867k = new HashSet();
        TypedArray typedArrayD = o.d(getContext(), attributeSet, p204q5.a.f46122p, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(3, false));
        this.j = typedArrayD.getResourceId(1, -1);
        this.f26866i = typedArrayD.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        WeakHashMap<View, Z> weakHashMap = O.f16859a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, Z> weakHashMap = O.f16859a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f26860c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f26854p);
        i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f26859b.add(new c(shapeAppearanceModel.f5611e, shapeAppearanceModel.f5614h, shapeAppearanceModel.f5612f, shapeAppearanceModel.f5613g));
        materialButton.setEnabled(isEnabled());
        O.n(materialButton, new b());
    }

    public final void b(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f26867k);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f26865h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f26866i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d(Set<Integer> set) {
        HashSet hashSet = this.f26867k;
        this.f26867k = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f26864g = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f26864g = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f26861d.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f26862e);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f26863f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                i.a aVarE = materialButton.getShapeAppearanceModel().e();
                c cVar2 = (c) this.f26859b.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    S5.a aVar = c.f26870e;
                    if (i10 == firstVisibleChildIndex) {
                        cVar = z10 ? t.b(this) ? new c(aVar, aVar, cVar2.f26872b, cVar2.f26873c) : new c(cVar2.f26871a, cVar2.f26874d, aVar, aVar) : new c(cVar2.f26871a, aVar, cVar2.f26872b, aVar);
                    } else if (i10 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (z10) {
                        cVar = t.b(this) ? new c(cVar2.f26871a, cVar2.f26874d, aVar, aVar) : new c(aVar, aVar, cVar2.f26872b, cVar2.f26873c);
                    } else {
                        cVar = new c(aVar, cVar2.f26874d, aVar, cVar2.f26873c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVarE.e(0.0f);
                    aVarE.f(0.0f);
                    aVarE.d(0.0f);
                    aVarE.c(0.0f);
                } else {
                    aVarE.f5622e = cVar2.f26871a;
                    aVarE.f5625h = cVar2.f26874d;
                    aVarE.f5623f = cVar2.f26872b;
                    aVarE.f5624g = cVar2.f26873c;
                }
                materialButton.setShapeAppearanceModel(aVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f26865h || this.f26867k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f26867k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f26867k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f26863f;
        return (numArr == null || i11 >= numArr.length) ? i11 : numArr[i11].intValue();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.j;
        if (i10 != -1) {
            d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(s.e.a(1, getVisibleButtonCount(), this.f26865h ? 1 : 2).f1432a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f26859b.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f26866i = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f26865h != z10) {
            this.f26865h = z10;
            d(new HashSet());
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName((this.f26865h ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
