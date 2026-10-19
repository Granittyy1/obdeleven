package com.obdeleven.service.model;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class DiagnosticSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f29363c;

    public enum KWP2000 {
        STANDARD("MAS00389", 0, 137),
        /* JADX INFO: Fake field, exist only in values array */
        ENGINEERING("MAS00497", 1, 134),
        /* JADX INFO: Fake field, exist only in values array */
        EOL_ECU("MAS00391", 2, 132),
        /* JADX INFO: Fake field, exist only in values array */
        EOL_VW("MAS00392", 3, 131),
        /* JADX INFO: Fake field, exist only in values array */
        OBD_EOBD("", 4, 129);

        private final int id;
        private final String name;
        private final String texttable;

        KWP2000(String str, int i10, int i11) {
            this.id = i11;
            this.name = str;
            this.texttable = str;
        }
    }

    public enum UDS {
        DEFAULT("MAS00391", 0, 3),
        /* JADX INFO: Fake field, exist only in values array */
        OBD_MODE("MAS00389", 1, 1),
        /* JADX INFO: Fake field, exist only in values array */
        SAFETY_SYSTEM("SER00037", 2, 4),
        /* JADX INFO: Fake field, exist only in values array */
        EOL("MAS00392", 3, 64),
        /* JADX INFO: Fake field, exist only in values array */
        IO_TEST("MAS00194", 4, 65),
        /* JADX INFO: Fake field, exist only in values array */
        DEVELOPMENT("MAS00497", 5, 79);

        private final int id;
        private final String name;
        private final String texttable;

        UDS(String str, int i10, int i11) {
            this.id = i11;
            this.name = str;
            this.texttable = str;
        }
    }

    public DiagnosticSession(int i10, String str, String str2) {
        this.f29361a = i10;
        this.f29362b = str;
        this.f29363c = str2;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        for (KWP2000 kwp2000 : KWP2000.values()) {
            arrayList.add(new DiagnosticSession(kwp2000.id, kwp2000.name, kwp2000.texttable));
        }
        return arrayList;
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        for (UDS uds : UDS.values()) {
            arrayList.add(new DiagnosticSession(uds.id, uds.name, uds.texttable));
        }
        return arrayList;
    }
}
