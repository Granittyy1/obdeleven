package androidx.databinding.library.baseAdapters;

import M0.c;
import M0.d;
import M0.h;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f17033a = new SparseIntArray(0);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f17034a = new HashMap<>(0);
    }

    @Override // M0.c
    public final List<c> a() {
        return new ArrayList(0);
    }

    @Override // M0.c
    public final h b(d dVar, View view, int i10) {
        if (f17033a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // M0.c
    public final h c(d dVar, View[] viewArr, int i10) {
        if (viewArr.length != 0 && f17033a.get(i10) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // M0.c
    public final int d(String str) {
        Integer num;
        if (str == null || (num = a.f17034a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
