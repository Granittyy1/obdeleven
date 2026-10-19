package p255u9;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/* JADX INFO: compiled from: UserStatisticsDB.java */
/* JADX INFO: loaded from: classes3.dex */
@ParseClassName("UserStatistics")
public final class C extends ParseObject {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f47457b = 0;

    public final int a() {
        return getInt("vehicleInfoShared") + getInt("logsShared") + getInt("historyShared") + getInt("chartsShared") + getInt("chartsCreated") + getInt("backupsCreated") + getInt("fullScanCompleted") + getInt("differentVehiclesConnected");
    }

    public final int b() {
        return getInt("labelsCreated") + getInt("manualsCreated") + getInt("securityCodesFound") + getInt("adaptationsChanged") + getInt("codingChanged") + getInt("appsUsed") + a();
    }
}
