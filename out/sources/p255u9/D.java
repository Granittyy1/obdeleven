package p255u9;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: VehicleBaseDB.kt */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("VehicleBase")
public final class D extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47458b = 0;

    public final String a() {
        String string = getString("model");
        return string == null ? "" : string;
    }

    public final ArrayList<Short> b() {
        ArrayList<Short> arrayList = new ArrayList<>();
        List list = getList("cuBlacklist");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Short.valueOf((short) Integer.valueOf((String) it.next(), 16).intValue()));
            }
        }
        return arrayList;
    }
}
