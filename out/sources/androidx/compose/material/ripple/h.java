package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import com.voltasit.obdeleven.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: RippleContainer.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f12001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12002f;

    public h(Context context) {
        super(context);
        this.f11998b = 5;
        ArrayList arrayList = new ArrayList();
        this.f11999c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f12000d = arrayList2;
        this.f12001e = new j(0);
        setClipChildren(false);
        l lVar = new l(context);
        addView(lVar);
        arrayList.add(lVar);
        arrayList2.add(lVar);
        this.f12002f = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final l a(i iVar) {
        j jVar = this.f12001e;
        l lVar = (l) ((LinkedHashMap) jVar.f12003b).get(iVar);
        if (lVar != null) {
            return lVar;
        }
        ArrayList arrayList = this.f12000d;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        l lVar2 = (l) (arrayList.isEmpty() ? null : arrayList.remove(0));
        LinkedHashMap linkedHashMap = (LinkedHashMap) jVar.f12003b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) jVar.f12004c;
        if (lVar2 == null) {
            int i10 = this.f12002f;
            ArrayList arrayList2 = this.f11999c;
            if (i10 > kotlin.collections.l.r(arrayList2)) {
                lVar2 = new l(getContext());
                addView(lVar2);
                arrayList2.add(lVar2);
            } else {
                lVar2 = (l) arrayList2.get(this.f12002f);
                i iVar2 = (i) linkedHashMap2.get(lVar2);
                if (iVar2 != null) {
                    iVar2.y0();
                    l lVar3 = (l) linkedHashMap.get(iVar2);
                    if (lVar3 != null) {
                    }
                    linkedHashMap.remove(iVar2);
                    lVar2.c();
                }
            }
            int i11 = this.f12002f;
            if (i11 < this.f11998b - 1) {
                this.f12002f = i11 + 1;
            } else {
                this.f12002f = 0;
            }
        }
        linkedHashMap.put(iVar, lVar2);
        linkedHashMap2.put(lVar2, iVar);
        return lVar2;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
