package androidx.room;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: DatabaseConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p285x2.c.InterfaceC0549c f20097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RoomDatabase.c f20098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f20099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f20100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RoomDatabase.JournalMode f20101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f20102h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f20103i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f20105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f20106m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f20107n;

    public b(Context context, String str, p285x2.c.InterfaceC0549c interfaceC0549c, RoomDatabase.c migrationContainer, ArrayList arrayList, boolean z10, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        kotlin.jvm.internal.i.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.i.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.i.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.i.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.i.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f20095a = context;
        this.f20096b = str;
        this.f20097c = interfaceC0549c;
        this.f20098d = migrationContainer;
        this.f20099e = arrayList;
        this.f20100f = z10;
        this.f20101g = journalMode;
        this.f20102h = queryExecutor;
        this.f20103i = transactionExecutor;
        this.j = z11;
        this.f20104k = z12;
        this.f20105l = linkedHashSet;
        this.f20106m = typeConverters;
        this.f20107n = autoMigrationSpecs;
    }
}
