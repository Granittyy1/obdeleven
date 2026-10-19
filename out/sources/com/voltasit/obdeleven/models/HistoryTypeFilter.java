package com.voltasit.obdeleven.models;

import com.voltasit.obdeleven.R;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class HistoryTypeFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HistoryTypeFilter f31131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HistoryTypeFilter f31132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HistoryTypeFilter f31133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HistoryTypeFilter f31134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HistoryTypeFilter f31135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HistoryTypeFilter f31136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HistoryTypeFilter f31137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HistoryTypeFilter f31138i;
    public static final HistoryTypeFilter j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HistoryTypeFilter f31139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ HistoryTypeFilter[] f31140l;
    private boolean checked;
    private final String enumTitle;
    private final boolean inFilter;
    private final int stringRes;

    /* JADX INFO: Fake field, exist only in values array */
    HistoryTypeFilter EF6;

    /* JADX INFO: Fake field, exist only in values array */
    HistoryTypeFilter EF0;

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$1, reason: invalid class name */
    public final enum AnonymousClass1 extends HistoryTypeFilter {
        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final List<HistoryTypeFilter> c() {
            return Arrays.asList(this, HistoryTypeFilter.f31131b);
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$2, reason: invalid class name */
    public final enum AnonymousClass2 extends HistoryTypeFilter {
        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final List<HistoryTypeFilter> c() {
            return Arrays.asList(this, HistoryTypeFilter.f31132c, HistoryTypeFilter.f31133d);
        }

        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final boolean g(HistoryDB historyDB) {
            JSONObject jSONObjectD = historyDB.d();
            return jSONObjectD.optString("oldValue").length() == jSONObjectD.optString("newValue").length();
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$3, reason: invalid class name */
    public final enum AnonymousClass3 extends HistoryTypeFilter {
        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final List<HistoryTypeFilter> c() {
            return Arrays.asList(this, HistoryTypeFilter.f31134e);
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$4, reason: invalid class name */
    public final enum AnonymousClass4 extends HistoryTypeFilter {
        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final List<HistoryTypeFilter> c() {
            return Arrays.asList(this, HistoryTypeFilter.f31135f);
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$5, reason: invalid class name */
    public final enum AnonymousClass5 extends HistoryTypeFilter {
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$6, reason: invalid class name */
    public final enum AnonymousClass6 extends HistoryTypeFilter {
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$7, reason: invalid class name */
    public final enum AnonymousClass7 extends HistoryTypeFilter {
        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final boolean g(HistoryDB historyDB) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$8, reason: invalid class name */
    public final enum AnonymousClass8 extends HistoryTypeFilter {
        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final boolean g(HistoryDB historyDB) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.voltasit.obdeleven.models.HistoryTypeFilter$9, reason: invalid class name */
    public final enum AnonymousClass9 extends HistoryTypeFilter {
        @Override // com.voltasit.obdeleven.models.HistoryTypeFilter
        public final boolean g(HistoryDB historyDB) {
            return true;
        }
    }

    static {
        HistoryTypeFilter historyTypeFilter = new HistoryTypeFilter(0, R.string.common_gateway_coding, "GATEWAY_CODING", "GATEWAY_CODING", true);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, R.string.common_coding, "CODING", "CODING", true);
        HistoryTypeFilter historyTypeFilter2 = new HistoryTypeFilter(2, R.string.common_coding, "SUB_CODING", "SUB_CODING", false);
        f31131b = historyTypeFilter2;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, R.string.common_long_coding, "LONG_CODING", "LONG_CODING", true);
        HistoryTypeFilter historyTypeFilter3 = new HistoryTypeFilter(4, R.string.common_long_coding, "SUB_LONG_CODING", "SUB_LONG_CODING", false);
        f31132c = historyTypeFilter3;
        HistoryTypeFilter historyTypeFilter4 = new HistoryTypeFilter(5, R.string.common_long_coding, "LONG_CODING_UDS", "LONG_CODING-UDS", false);
        f31133d = historyTypeFilter4;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(6, R.string.common_adaptation, "ADAPTATION", "ADAPTATION", true);
        HistoryTypeFilter historyTypeFilter5 = new HistoryTypeFilter(7, R.string.common_adaptation, "ADAPTATION_UDS", "ADAPTATION-UDS", false);
        f31134e = historyTypeFilter5;
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(8, R.string.common_basic_settings, "BASIC_SETTINGS", "BASIC_SETTINGS", true);
        HistoryTypeFilter historyTypeFilter6 = new HistoryTypeFilter(9, R.string.common_basic_settings, "BASIC_SETTINGS_UDS", "BASIC_SETTINGS-UDS", false);
        f31135f = historyTypeFilter6;
        HistoryTypeFilter historyTypeFilter7 = new HistoryTypeFilter(10, R.string.common_coding2, "CODING_II", "CODING_II", true);
        HistoryTypeFilter historyTypeFilter8 = new HistoryTypeFilter(11, R.string.common_diagnostic_session, "DIAGNOSTIC_SESSION", "DIAGNOSTIC_SESSION", true);
        HistoryTypeFilter historyTypeFilter9 = new HistoryTypeFilter(12, R.string.common_app, "APP", "APP", true);
        f31136g = historyTypeFilter9;
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(13, R.string.common_backup, "BACKUP", "BACKUP", true);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(14, R.string.common_full_backup, "BACKUP_ALL", "BACKUP_ALL", true);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(15, R.string.common_fault, "FAULT", "FAULT", true);
        f31137h = anonymousClass7;
        AnonymousClass8 anonymousClass8 = new AnonymousClass8(16, R.string.common_full_scan, "SCAN", "SCAN", true);
        f31138i = anonymousClass8;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9(17, R.string.view_eeprom_title, "EEPROM", "EEPROM", true);
        HistoryTypeFilter historyTypeFilter10 = new HistoryTypeFilter(18, R.string.common_clear, "CLEAR", "CLEAR", true);
        j = historyTypeFilter10;
        HistoryTypeFilter historyTypeFilter11 = new HistoryTypeFilter(19, R.string.common_unknown, "UNKNOWN", "UNKNOWN", false);
        f31139k = historyTypeFilter11;
        f31140l = new HistoryTypeFilter[]{historyTypeFilter, anonymousClass1, historyTypeFilter2, anonymousClass2, historyTypeFilter3, historyTypeFilter4, anonymousClass3, historyTypeFilter5, anonymousClass4, historyTypeFilter6, historyTypeFilter7, historyTypeFilter8, historyTypeFilter9, anonymousClass5, anonymousClass6, anonymousClass7, anonymousClass8, anonymousClass9, historyTypeFilter10, historyTypeFilter11};
    }

    public HistoryTypeFilter(int i10, int i11, String str, String str2, boolean z10) {
        super(str, i10);
        this.checked = true;
        this.stringRes = i11;
        this.enumTitle = str2;
        this.inFilter = z10;
    }

    public static void a() {
        for (HistoryTypeFilter historyTypeFilter : values()) {
            if (historyTypeFilter == f31137h || historyTypeFilter == j) {
                historyTypeFilter.checked = false;
            } else {
                historyTypeFilter.checked = true;
            }
        }
    }

    public static HistoryTypeFilter b(String str) {
        for (HistoryTypeFilter historyTypeFilter : values()) {
            if (historyTypeFilter.enumTitle.equals(str)) {
                return historyTypeFilter;
            }
        }
        return f31139k;
    }

    public static ArrayList<HistoryTypeFilter> f() {
        ArrayList<HistoryTypeFilter> arrayList = new ArrayList<>();
        for (HistoryTypeFilter historyTypeFilter : values()) {
            if (historyTypeFilter.inFilter) {
                arrayList.add(historyTypeFilter);
            }
        }
        return arrayList;
    }

    public static HistoryTypeFilter valueOf(String str) {
        return (HistoryTypeFilter) Enum.valueOf(HistoryTypeFilter.class, str);
    }

    public static HistoryTypeFilter[] values() {
        return (HistoryTypeFilter[]) f31140l.clone();
    }

    public List<HistoryTypeFilter> c() {
        return Collections.singletonList(this);
    }

    public final String d() {
        return this.enumTitle;
    }

    public final int e() {
        return this.stringRes;
    }

    public boolean g(HistoryDB historyDB) {
        return this instanceof AnonymousClass6;
    }

    public final boolean h() {
        return this.checked;
    }

    public final void i(boolean z10) {
        this.checked = z10;
    }
}
