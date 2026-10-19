package p255u9;

import android.text.TextUtils;
import com.braze.Constants;
import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

/* JADX INFO: compiled from: VehicleDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("Vehicle")
public final class E extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47459b = 0;

    public static ParseQuery<E> a() {
        int i10 = z.f47484b;
        ParseQuery query = ((z) ParseUser.getCurrentUser()).b().getQuery();
        query.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        query.include("vehicleModification").include("vehicleBase").include("engine").include("equipment");
        query.addDescendingOrder("updatedAt");
        return query;
    }

    public static E b(F f10) {
        String str;
        D d10 = (D) f10.getParseObject("vehicleBase");
        E e10 = new E();
        int i10 = d10.getInt("startYear");
        int i11 = d10.getInt("endYear");
        if (i10 != 0) {
            str = i10 + "...";
            if (i11 != 0) {
                str = str + i11;
            }
        } else {
            str = "";
        }
        e10.put("year", str);
        e10.put("vehicleBase", d10);
        e10.put("vehicleModification", f10);
        return e10;
    }

    public static ParseQuery<E> h() {
        ParseQuery<E> query = ParseQuery.getQuery(E.class);
        query.include("vehicleModification");
        query.include("vehicleBase");
        query.include("engine");
        query.include("equipment");
        query.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        return query;
    }

    public final C2802e c() {
        return (C2802e) getParseObject("engine");
    }

    public final String d() {
        String string = getString("make");
        if (TextUtils.isEmpty(string) && has("vehicleBase")) {
            D dI = i();
            string = dI == null ? "" : dI.getString("make");
        }
        return TextUtils.isEmpty(string) ? "" : string;
    }

    public final String e() {
        String string = getString("model");
        if (TextUtils.isEmpty(string) && has("vehicleModification")) {
            F fJ = j();
            string = fJ == null ? "" : fJ.getString("model");
        }
        if (TextUtils.isEmpty(string) && has("vehicleBase")) {
            D dI = i();
            string = dI == null ? "" : dI.a();
        }
        return TextUtils.isEmpty(string) ? "" : string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0039  */
    public final String f() {
        String url;
        ParseFile parseFile = getParseFile("picture");
        if (parseFile == null) {
            F fJ = j();
            if (fJ != null) {
                ParseFile parseFile2 = fJ.getParseFile("picture");
                if (parseFile2 != null) {
                    url = parseFile2.getUrl();
                } else {
                    url = null;
                }
            } else if (i() != null) {
                ParseFile parseFile3 = i().getParseFile("picture");
                url = parseFile3 != null ? parseFile3.getUrl() : i().getString("picture_url");
            } else {
                url = null;
            }
        } else {
            url = parseFile.getUrl();
        }
        return url == null ? "" : url;
    }

    public final D i() {
        return (D) getParseObject("vehicleBase");
    }

    public final F j() {
        return (F) getParseObject("vehicleModification");
    }

    public final String k() {
        String string = getString("vin");
        return string == null ? "" : string;
    }
}
