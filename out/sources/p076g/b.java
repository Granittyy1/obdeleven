package p076g;

import android.content.Context;
import android.content.Intent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.k;
import kotlin.collections.m;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.internal.i;
import p186p0.a;

/* JADX INFO: compiled from: ActivityResultContracts.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a<String[], Map<String, Boolean>> {
    @Override // p076g.a
    public final Intent createIntent(Context context, String[] strArr) {
        String[] input = strArr;
        i.e(context, "context");
        i.e(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
        i.d(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p076g.a
    public final a.C0368a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        String[] input = strArr;
        i.e(context, "context");
        i.e(input, "input");
        if (input.length == 0) {
            return new a.C0368a<>((Serializable) y.p());
        }
        for (String str : input) {
            if (a.a(context, str) != 0) {
                return null;
            }
        }
        int iN = x.n(input.length);
        if (iN < 16) {
            iN = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iN);
        for (String str2 : input) {
            Pair pair = new Pair(str2, Boolean.TRUE);
            linkedHashMap.put(pair.c(), pair.d());
        }
        return new a.C0368a<>(linkedHashMap);
    }

    @Override // p076g.a
    public final Map<String, Boolean> parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            return y.p();
        }
        if (intent == null) {
            return y.p();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return y.p();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i11 == 0));
        }
        ArrayList arrayListO = k.O(stringArrayExtra);
        Iterator it = arrayListO.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(m.y(arrayListO, 10), m.y(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(new Pair(it.next(), it2.next()));
        }
        return y.w(arrayList2);
    }
}
