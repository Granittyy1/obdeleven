package p267v9;

import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p255u9.u;
import p255u9.z;
import p279w9.d;

/* JADX INFO: compiled from: Texttable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f47671a = "en";

    public static HashMap a(ArrayList arrayList) throws ParseException {
        ParseQuery query = ParseQuery.getQuery(u.class);
        query.whereContainedIn("textId", arrayList);
        query.addAscendingOrder("textId");
        query.addAscendingOrder("language");
        query.addDescendingOrder("rating");
        query.addDescendingOrder("createdAt");
        ArrayList<u> arrayListE = d.e(query);
        int i10 = z.f47484b;
        query.whereEqualTo("usersRated", (z) ParseUser.getCurrentUser());
        ArrayList arrayListE2 = d.e(query);
        HashMap map = new HashMap();
        for (u uVar : arrayListE) {
            String string = uVar.getString("textId");
            String string2 = uVar.getString("language");
            Iterator it = arrayListE2.iterator();
            while (it.hasNext()) {
                if (((u) it.next()).getObjectId().equals(uVar.getObjectId())) {
                    uVar.f47481b = true;
                    break;
                }
            }
            HashMap map2 = (HashMap) map.get(string);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(string, map2);
            }
            List arrayList2 = (List) map2.get(string2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map2.put(string2, arrayList2);
            }
            arrayList2.add(uVar);
        }
        return map;
    }
}
