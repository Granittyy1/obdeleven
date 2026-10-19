package p121j8;

import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.boltsinternal.Task;
import com.voltasit.parse.model.ControlUnitLabelDB;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import p255u9.u;
import p255u9.z;
import p267v9.a;
import p279w9.d;

/* JADX INFO: compiled from: Label.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControlUnitLabelDB.Type f41142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ParseObject f41143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f41145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, HashMap<String, List<u>>> f41146e;

    public c(ControlUnitLabelDB.Type type, ParseObject parseObject, int i10, ArrayList arrayList, HashMap map) {
        this.f41142a = type;
        this.f41143b = parseObject;
        this.f41144c = i10;
        this.f41145d = arrayList;
        this.f41146e = map;
    }

    public static Task a(final int i10, final ControlUnit controlUnit, final ControlUnitLabelDB.Type type) {
        return Task.callInBackground(new Callable() { // from class: j8.a
            @Override // java.util.concurrent.Callable
            public final Object call() throws ControlUnitException, ParseException {
                ParseObject parseObjectU = controlUnit.U();
                HashMap map = new HashMap();
                int i11 = ControlUnitLabelDB.f34408b;
                ParseQuery query = ParseQuery.getQuery(ControlUnitLabelDB.class);
                query.whereEqualTo("relationId", parseObjectU.getString("relationId"));
                ControlUnitLabelDB.Type type2 = type;
                query.whereEqualTo("type", type2.name());
                int i12 = i10;
                query.whereEqualTo("channel", Integer.valueOf(i12));
                ArrayList arrayListE = d.e(query);
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListE.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ControlUnitLabelDB) it.next()).getString("description"));
                }
                if (!arrayList.isEmpty()) {
                    map = p267v9.a.a(arrayList);
                }
                return new c(type2, parseObjectU, i12, arrayListE, map);
            }
        });
    }

    public final ControlUnitLabelDB b(int i10) {
        for (ControlUnitLabelDB controlUnitLabelDB : this.f41145d) {
            if (controlUnitLabelDB.getInt("value") == i10) {
                return controlUnitLabelDB;
            }
        }
        return null;
    }

    public final List<u> c(ControlUnitLabelDB controlUnitLabelDB, String str) {
        if (controlUnitLabelDB == null) {
            return null;
        }
        HashMap<String, List<u>> map = this.f41146e.get(controlUnitLabelDB.getString("description"));
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final u d(ControlUnitLabelDB controlUnitLabelDB, String str) {
        List<u> listC = c(controlUnitLabelDB, str);
        if (listC == null) {
            return null;
        }
        for (u uVar : listC) {
            String objectId = ((z) uVar.getParseObject(Participant.USER_TYPE)).getObjectId();
            int i10 = z.f47484b;
            if (objectId.equals(((z) ParseUser.getCurrentUser()).getObjectId())) {
                return uVar;
            }
        }
        return null;
    }

    public final String e(int i10) {
        List<u> listC = c(b(i10), a.f47671a);
        u uVar = listC == null ? null : listC.get(0);
        if (uVar == null) {
            return null;
        }
        return uVar.getString("value");
    }
}
