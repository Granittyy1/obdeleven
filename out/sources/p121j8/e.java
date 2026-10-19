package p121j8;

import B7.b;
import com.obdeleven.service.exception.ControlUnitException;
import com.obdeleven.service.model.ControlUnit;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.parse.Parse;
import com.voltasit.parse.model.ControlUnitLabelDB;
import io.intercom.android.sdk.models.Participant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p255u9.u;
import p255u9.z;
import p279w9.a;
import p279w9.d;

/* JADX INFO: compiled from: LongCodingLabel.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParseObject f41154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41156c;

    public e(ParseObject parseObject, ArrayList arrayList, HashMap map) {
        this.f41154a = parseObject;
        this.f41155b = arrayList;
        this.f41156c = map;
    }

    public static e a(ControlUnit controlUnit) throws ControlUnitException, ParseException {
        ParseObject parseObjectU = controlUnit.U();
        if (parseObjectU == null) {
            return null;
        }
        a aVar = new a(b.c("LONG_CODING_LABEL", "LONG_CODING" + parseObjectU.getObjectId()), 3600000L);
        e eVar = (e) Parse.f34395b.i().e(aVar);
        if (eVar != null) {
            O.e.j("LongCodingLabel", "Returning cached long coding label");
            return eVar;
        }
        HashMap map = new HashMap();
        ParseQuery query = ParseQuery.getQuery(ControlUnitLabelDB.class);
        query.whereEqualTo("relationId", parseObjectU.getString("relationId"));
        query.whereEqualTo("type", "LONG_CODING");
        query.addAscendingOrder("channel");
        query.addAscendingOrder("bit");
        query.addAscendingOrder("value");
        ArrayList arrayListE = d.e(query);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            arrayList.add(((ControlUnitLabelDB) it.next()).getString("description"));
        }
        if (!arrayList.isEmpty()) {
            map = p267v9.a.a(arrayList);
        }
        e eVar2 = new e(parseObjectU, arrayListE, map);
        Parse.f34395b.i().h(aVar, eVar2);
        return eVar2;
    }

    public final ArrayList b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (ControlUnitLabelDB controlUnitLabelDB : this.f41155b) {
            int i12 = controlUnitLabelDB.getInt("channel");
            int i13 = controlUnitLabelDB.getInt("bit");
            if (i12 == i10 && i13 == i11) {
                arrayList.add(controlUnitLabelDB);
            }
        }
        return arrayList;
    }

    public final List<u> c(ControlUnitLabelDB controlUnitLabelDB, String str) {
        if (controlUnitLabelDB == null) {
            return null;
        }
        HashMap map = (HashMap) this.f41156c.get(controlUnitLabelDB.getString("description"));
        if (map == null) {
            return null;
        }
        return (List) map.get(str);
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
}
