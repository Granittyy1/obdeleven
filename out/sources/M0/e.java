package M0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* JADX INFO: compiled from: DataBindingUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f4480a = new DataBinderMapperImpl();

    public static <T extends h> T a(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, d dVar) {
        boolean z11 = viewGroup != null && z10;
        int childCount = z11 ? viewGroup.getChildCount() : 0;
        View viewInflate = layoutInflater.inflate(i10, viewGroup, z10);
        DataBinderMapperImpl dataBinderMapperImpl = f4480a;
        if (!z11) {
            return (T) dataBinderMapperImpl.b(dVar, viewInflate, i10);
        }
        int childCount2 = viewGroup.getChildCount();
        int i11 = childCount2 - childCount;
        if (i11 == 1) {
            return (T) dataBinderMapperImpl.b(dVar, viewGroup.getChildAt(childCount2 - 1), i10);
        }
        View[] viewArr = new View[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            viewArr[i12] = viewGroup.getChildAt(i12 + childCount);
        }
        return (T) dataBinderMapperImpl.c(dVar, viewArr, i10);
    }
}
