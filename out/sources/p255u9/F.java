package p255u9;

import androidx.recyclerview.widget.t;
import com.braze.Constants;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/* JADX INFO: compiled from: VehicleModificationDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("VehicleModification")
public final class F extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47460b = 0;

    public static ParseQuery<F> a(String str) {
        ParseQuery<?> query = ParseQuery.getQuery(D.class);
        query.whereEqualTo("make", str);
        query.whereEqualTo("supported", Boolean.TRUE);
        query.setLimit(t.d.DEFAULT_DRAG_ANIMATION_DURATION);
        ParseQuery<F> query2 = ParseQuery.getQuery(F.class);
        query2.whereMatchesQuery("vehicleBase", query);
        query2.include("vehicleBase");
        query2.setLimit(Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS);
        return query2;
    }
}
