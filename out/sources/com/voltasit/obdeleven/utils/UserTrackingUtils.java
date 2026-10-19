package com.voltasit.obdeleven.utils;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.voltasit.obdeleven.Application;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.models.Participant;
import java.util.List;
import p255u9.C;
import p255u9.z;

/* JADX INFO: loaded from: classes3.dex */
public final class UserTrackingUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static com.voltasit.obdeleven.a f34238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Application f34239b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class Key {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final Key f34240A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final Key f34241B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public static final Key f34242C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final Key f34243D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final Key f34244E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final Key f34245F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public static final Key f34246G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public static final Key f34247H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final Key f34248I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final Key f34249J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static final Key f34250K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final Key f34251L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public static final Key f34252M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final Key f34253N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final Key f34254O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final Key f34255P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public static final Key f34256Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public static final /* synthetic */ Key[] f34257R;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Key f34258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Key f34259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Key f34260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Key f34261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Key f34262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Key f34263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Key f34264h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Key f34265i;
        public static final Key j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Key f34266k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Key f34267l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final Key f34268m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Key f34269n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final Key f34270o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final Key f34271p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Key f34272q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Key f34273r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final Key f34274s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final Key f34275t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final Key f34276u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final Key f34277v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final Key f34278w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final Key f34279x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final Key f34280y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Key f34281z;
        private final Class aClass;
        private final String firebaseTitle;
        private final boolean isVisible;
        private final String parse;
        private final int textResource;

        /* JADX INFO: Fake field, exist only in values array */
        Key EF8;

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$1, reason: invalid class name */
        public final enum AnonymousClass1 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.button_blue);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_device;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$10, reason: invalid class name */
        public final enum AnonymousClass10 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.green_l);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_labels_created;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$2, reason: invalid class name */
        public final enum AnonymousClass2 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.button_blue);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_scans;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$3, reason: invalid class name */
        public final enum AnonymousClass3 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.button_blue);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_backups;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$4, reason: invalid class name */
        public final enum AnonymousClass4 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.button_blue);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_charts_created;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$5, reason: invalid class name */
        public final enum AnonymousClass5 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.button_blue);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_info_shared;
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int d(C c10) {
                long jA = UserTrackingUtils.a(Key.f34248I, Key.f34247H, Key.f34243D, Key.f34249J);
                return c10.getInt("vehicleInfoShared") + c10.getInt("logsShared") + c10.getInt("historyShared") + c10.getInt("chartsShared") + ((int) jA);
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$6, reason: invalid class name */
        public final enum AnonymousClass6 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.yellow_700);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_app_activated;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$7, reason: invalid class name */
        public final enum AnonymousClass7 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.yellow_700);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_programming_completed;
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int d(C c10) {
                long jA = UserTrackingUtils.a(Key.f34276u, Key.f34242C);
                return c10.getInt("adaptationsChanged") + c10.getInt("codingChanged") + ((int) jA);
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$8, reason: invalid class name */
        public final enum AnonymousClass8 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.green_l);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_login_codes;
            }
        }

        /* JADX INFO: renamed from: com.voltasit.obdeleven.utils.UserTrackingUtils$Key$9, reason: invalid class name */
        public final enum AnonymousClass9 extends Key {
            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int a(Resources resources) {
                return resources.getColor(R.color.green_l);
            }

            @Override // com.voltasit.obdeleven.utils.UserTrackingUtils.Key
            public final int c() {
                return R.drawable.icon_manuals_created;
            }
        }

        static {
            Class cls = Integer.TYPE;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1("DIFFERENT_VEHICLES_CONNECTED", 0, "differentVehiclesConnected", "different_vehicles_connected", R.string.view_statistics_different_vehicles_connected, true, cls);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2("FULL_SCAN_COMPLETED", 1, "fullScanCompleted", "full_scans_completed", R.string.view_statistics_full_scan_comp, true, cls);
            f34258b = anonymousClass2;
            AnonymousClass3 anonymousClass3 = new AnonymousClass3("BACKUPS_CREATED", 2, "backupsCreated", "backup_created", R.string.view_statistics_backups_created, true, cls);
            f34259c = anonymousClass3;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4("CHARTS_CREATED", 3, "chartsCreated", "charts_created", R.string.view_statistics_charts_created, true, cls);
            f34260d = anonymousClass4;
            AnonymousClass5 anonymousClass5 = new AnonymousClass5("INFO_SHARED", 4, null, "info_shared", R.string.view_statistics_info_shared, true, cls);
            AnonymousClass6 anonymousClass6 = new AnonymousClass6("APPS_USED", 5, "appsUsed", "apps_activated", R.string.view_statistics_apps_activated, true, cls);
            f34261e = anonymousClass6;
            AnonymousClass7 anonymousClass7 = new AnonymousClass7("PROGRAMMING_COMPLETED", 6, null, "programming_completed", R.string.view_statistics_programming_completed, true, cls);
            AnonymousClass8 anonymousClass8 = new AnonymousClass8("SECURITY_CODES_FOUND", 7, "securityCodesFound", "security_codes_found", R.string.view_statistics_security_codes_found, true, cls);
            f34262f = anonymousClass8;
            AnonymousClass9 anonymousClass9 = new AnonymousClass9("MANUALS_CREATED", 8, "manualsCreated", "manuals_created", R.string.view_statistics_manuals_created, true, cls);
            f34263g = anonymousClass9;
            AnonymousClass10 anonymousClass10 = new AnonymousClass10("LABELS_CREATED", 9, "labelsCreated", "labels_created", R.string.view_statistics_labels_created, true, cls);
            f34264h = anonymousClass10;
            Key key = new Key("PART_ADDED", 10, "partsAdded", "parts_added", -1, false, cls);
            Key key2 = new Key("PART_OPENED", 11, "partsOpened", "parts_opened", -1, false, cls);
            Key key3 = new Key("PART_CONTACT_CLICKED", 12, "partsContactsClicked", "parts_contacts_clicked", -1, false, cls);
            Key key4 = new Key("APP_OPENED", 13, "appOpened", "app_opened", -1, false, cls);
            f34265i = key4;
            Key key5 = new Key("INFO_WATCHED", 14, null, "info_watched", -1, false, cls);
            j = key5;
            Key key6 = new Key("TIME_SPENT", 15, "timeSpent", null, -1, false, Long.TYPE);
            f34266k = key6;
            Key key7 = new Key("MANUALS_WATCHED", 16, "manualsWatched", "manuals_watched", -1, false, cls);
            f34267l = key7;
            Key key8 = new Key("VEHICLES_CONNECTED", 17, "vehiclesConnected", "vehicles_connected", -1, false, cls);
            f34268m = key8;
            Key key9 = new Key("SERVICES_CHANGE_USED", 18, null, "service_change_used", -1, false, cls);
            f34269n = key9;
            Key key10 = new Key("SECURITY_CODES_USED", 19, null, "security_codes_used", -1, false, cls);
            f34270o = key10;
            Key key11 = new Key("CODING_WATCHED", 20, null, "coding_watched", -1, false, cls);
            f34271p = key11;
            Key key12 = new Key("READINESS_WATCHED", 21, null, "readiness_watched", -1, false, cls);
            f34272q = key12;
            Key key13 = new Key("EQUIPMENT_CODES_ADDED", 22, null, "equipment_codes_added", -1, false, cls);
            f34273r = key13;
            Key key14 = new Key("FAULTS_FREEZE_FRAME_WATCHED", 23, null, "faults_freeze_frame_watched", -1, false, cls);
            f34274s = key14;
            Key key15 = new Key("SECURITY_CODES_FINDER_USED", 24, null, "security_codes_finder_used", -1, false, cls);
            f34275t = key15;
            Key key16 = new Key("CODING_CHANGED", 25, "codingChanged", "coding_changed", -1, false, cls);
            f34276u = key16;
            Key key17 = new Key("CONTROL_UNIT_RESET_USED", 26, null, "control_unit_reset_used", -1, false, cls);
            Key key18 = new Key("FULL_CLEAR_COMPLETED", 27, null, "full_clear_completed", -1, false, cls);
            f34277v = key18;
            Key key19 = new Key("USER_PHOTO_CHANGED", 28, null, "user_photo_changed", -1, false, cls);
            f34278w = key19;
            Key key20 = new Key("VEHICLE_PHOTO_CHANGED", 29, null, "vehicle_photo_changed", -1, false, cls);
            f34279x = key20;
            Key key21 = new Key("BASIC_SETTINGS_USED", 30, "basicSettingUsed", "basic_setting_used", -1, false, cls);
            f34280y = key21;
            Key key22 = new Key("ADAPTATIONS_WATCHED", 31, null, "adaptations_watched", -1, false, cls);
            f34281z = key22;
            Key key23 = new Key("OUTPUT_TEST_USED", 32, "outputTestUsed", "output_test_used", -1, false, cls);
            f34240A = key23;
            Key key24 = new Key("VEHICLES_DELETED", 33, null, "vehicles_deleted", -1, false, cls);
            f34241B = key24;
            Key key25 = new Key("ADAPTATIONS_CHANGED", 34, "adaptationsChanged", "adaptations_changed", -1, false, cls);
            f34242C = key25;
            Key key26 = new Key("GAUGES_WATCHED", 35, "gaugesWatched", "gauges_watched", -1, false, cls);
            Key key27 = new Key("LOGS_SHARED", 36, "logsShared", "logs_shared", -1, false, cls);
            f34243D = key27;
            Key key28 = new Key("LOOKUPS_USED", 37, "lookupsUsed", "lookups_used", -1, false, cls);
            f34244E = key28;
            Key key29 = new Key("BACKGROUND_CHANGED", 38, null, "background_changed", -1, false, cls);
            f34245F = key29;
            Key key30 = new Key("LIVE_DATA_WATCHED", 39, null, "live_data_watched", -1, false, cls);
            f34246G = key30;
            Key key31 = new Key("HISTORY_SHARED", 40, "historyShared", "history_shared", -1, false, cls);
            f34247H = key31;
            Key key32 = new Key("VEHICLES_ADDED", 41, "vehiclesAdded", "vehicles_added", -1, false, cls);
            Key key33 = new Key("CHARTS_SHARED", 42, "chartsShared", "charts_shared", -1, false, cls);
            f34248I = key33;
            Key key34 = new Key("VEHICLE_INFO_SHARED", 43, "vehicleInfoShared", "vehicle_info_shared", -1, false, cls);
            f34249J = key34;
            Key key35 = new Key("FAULTS_GOOGLED", 44, null, "faults_googled", -1, false, cls);
            f34250K = key35;
            Key key36 = new Key("FAULTS_CLEARED", 45, "faultsCleared", "faults_cleared", -1, false, cls);
            f34251L = key36;
            Key key37 = new Key("ENGINE_CODES_ADDED", 46, null, "engine_codes_added", -1, false, cls);
            f34252M = key37;
            Key key38 = new Key("FAULTS_WATCHED", 47, null, "faults_watched", -1, false, cls);
            f34253N = key38;
            Key key39 = new Key("VEHICLE_NAME_CHANGED", 48, null, "vehicle_name_changed", -1, false, cls);
            f34254O = key39;
            Key key40 = new Key("HELP_USED", 49, null, "help_used", -1, false, cls);
            f34255P = key40;
            Key key41 = new Key("ADVANCED_INFO_WATCHED", 50, null, "advance_info_watched", -1, false, cls);
            f34256Q = key41;
            f34257R = new Key[]{anonymousClass1, anonymousClass2, anonymousClass3, anonymousClass4, anonymousClass5, anonymousClass6, anonymousClass7, anonymousClass8, anonymousClass9, anonymousClass10, key, key2, key3, key4, key5, key6, key7, key8, key9, key10, key11, key12, key13, key14, key15, key16, key17, key18, key19, key20, key21, key22, key23, key24, key25, key26, key27, key28, key29, key30, key31, key32, key33, key34, key35, key36, key37, key38, key39, key40, key41};
        }

        public Key(String str, int i10, String str2, String str3, int i11, boolean z10, Class cls) {
            super(str, i10);
            this.parse = str2;
            this.firebaseTitle = str3;
            this.textResource = i11;
            this.isVisible = z10;
            this.aClass = cls;
        }

        public static Key valueOf(String str) {
            return (Key) Enum.valueOf(Key.class, str);
        }

        public static Key[] values() {
            return (Key[]) f34257R.clone();
        }

        public int a(Resources resources) {
            return resources.getColor(R.color.black);
        }

        public final String b() {
            return this.firebaseTitle;
        }

        public int c() {
            return 0;
        }

        public int d(C c10) {
            if (c10 == null) {
                return 0;
            }
            return c10.getInt(this.parse) + ((int) UserTrackingUtils.a(this));
        }

        public final String e() {
            return this.parse;
        }

        public final int f() {
            return this.textResource;
        }

        public final Class g() {
            return this.aClass;
        }

        public final boolean h() {
            return this.isVisible;
        }
    }

    public static long a(Key... keyArr) {
        long jD = 0;
        for (Key key : keyArr) {
            jD += (long) f34238a.d("parse_" + key.e(), 0);
        }
        return jD;
    }

    public static void b(z zVar, com.voltasit.obdeleven.a aVar) throws ParseException {
        C c10;
        ParseQuery query = ParseQuery.getQuery(C.class);
        query.whereEqualTo(Participant.USER_TYPE, zVar);
        List listFind = query.find();
        if (listFind.isEmpty()) {
            c10 = new C();
            c10.put(Participant.USER_TYPE, zVar);
        } else {
            c10 = (C) listFind.get(0);
        }
        for (Key key : Key.values()) {
            if (key.e() != null) {
                if (key.g() == Long.TYPE) {
                    long jE = aVar.e("parse_" + key.e());
                    if (jE != 0) {
                        String strE = key.e();
                        Long lValueOf = Long.valueOf(jE);
                        if (c10.getLong(strE) + jE >= 0) {
                            c10.increment(strE, lValueOf);
                        }
                        aVar.n(0L, "parse_" + key.e());
                    }
                } else {
                    long jD = aVar.d("parse_" + key.e(), 0);
                    if (jD != 0) {
                        String strE2 = key.e();
                        Long lValueOf2 = Long.valueOf(jD);
                        if (c10.getLong(strE2) + jD >= 0) {
                            c10.increment(strE2, lValueOf2);
                        }
                        aVar.l(0, "parse_" + key.e());
                    }
                }
            }
        }
        zVar.saveInBackground();
        c10.save();
        SharedPreferences.Editor editorF = aVar.f();
        if (editorF != null) {
            editorF.putBoolean("update_statistics", false);
            editorF.apply();
        }
    }

    public static synchronized void c(Key key, int i10) {
        try {
            int i11 = z.f47484b;
            if (((z) ParseUser.getCurrentUser()) == null) {
                return;
            }
            if (key.b() != null) {
                FirebaseAnalytics.getInstance(f34239b).a(null, key.b());
            }
            if (key.e() == null) {
                return;
            }
            String str = "parse_" + key.e();
            com.voltasit.obdeleven.a aVar = f34238a;
            aVar.l(aVar.d(str, 0) + i10, str);
            SharedPreferences.Editor editorF = f34238a.f();
            if (editorF != null) {
                editorF.putBoolean("update_statistics", true);
                editorF.apply();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
