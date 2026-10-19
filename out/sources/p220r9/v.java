package p220r9;

import Jb.a;
import com.parse.ControlUnitDB;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.voltasit.parse.model.HistoryDB;
import java.util.ArrayList;
import java.util.Date;
import kotlin.collections.l;
import kotlin.jvm.internal.i;
import p255u9.E;

/* JADX INFO: compiled from: HistoryQueryBuilderLegacy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Date f46489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E f46490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ControlUnitDB f46491e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f46493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f46494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f46495i;
    public ParseObject j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f46498m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ParseQuery<HistoryDB> f46488b = ParseQuery.getQuery(HistoryDB.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46492f = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f46499n = -1;

    public final ParseQuery<HistoryDB> a() {
        ParseQuery<HistoryDB> query;
        ParseQuery query2 = ParseQuery.getQuery(HistoryDB.class);
        ParseQuery query3 = ParseQuery.getQuery(HistoryDB.class);
        if (this.f46494h) {
            query = ParseQuery.getQuery(HistoryDB.class);
        } else {
            query2.whereEqualTo("archived", Boolean.FALSE);
            query3.whereDoesNotExist("archived");
            query = ParseQuery.or(l.s(query2, query3));
        }
        this.f46488b = query;
        E e10 = this.f46490d;
        if (e10 != null) {
            query.whereEqualTo("vehicle", e10);
        }
        ControlUnitDB controlUnitDB = this.f46491e;
        if (controlUnitDB != null) {
            this.f46488b.whereEqualTo("controlUnit", controlUnitDB);
        }
        this.f46488b.whereNotEqualTo("type", "SECURITY_ACCESS");
        ArrayList arrayList = this.f46493g;
        if (arrayList != null) {
            this.f46488b.whereContainedIn("type", arrayList);
        }
        Date date = this.f46489c;
        if (date != null) {
            this.f46488b.whereGreaterThan("createdAt", date);
        }
        if (this.f46495i) {
            this.f46488b.whereDoesNotExist("parent");
        } else {
            ParseObject parseObject = this.j;
            if (parseObject != null) {
                this.f46488b.whereEqualTo("parent", parseObject);
            }
        }
        if (this.f46492f >= 0) {
            int i10 = this.f46499n;
            if (i10 >= 1) {
                this.f46488b.setLimit(i10);
                this.f46488b.setSkip(this.f46492f * this.f46499n);
            } else {
                this.f46488b.setLimit(10);
                this.f46488b.setSkip(this.f46492f * 10);
            }
        }
        this.f46488b.include("controlUnit");
        this.f46488b.include("vehicle");
        if (this.f46497l) {
            this.f46488b.include("vehicle.vehicleModification");
        }
        if (this.f46496k) {
            ParseQuery<?> query4 = ParseQuery.getQuery(ControlUnitDB.class);
            query4.whereEqualTo("vehicle", this.f46490d);
            query4.whereExists("controlUnitBase");
            this.f46488b.whereMatchesQuery("controlUnit", query4);
            this.f46488b.include("vehicle.vehicleBase");
        }
        if (this.f46498m) {
            this.f46488b.include("vehicle.engine");
        }
        this.f46488b.include("controlUnit.controlUnitBase");
        this.f46488b.include("controlUnit.controlUnitBase.texttable");
        this.f46488b.orderByDescending("createdAt");
        ParseQuery<HistoryDB> query5 = this.f46488b;
        i.d(query5, "query");
        return query5;
    }

    @Override // Jb.a
    public final Ib.a i() {
        return a.C0058a.a();
    }
}
