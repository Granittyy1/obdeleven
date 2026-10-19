package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: SharedSQLiteStatement.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f20092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f20093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p293xa.g f20094c;

    public SharedSQLiteStatement(RoomDatabase database) {
        kotlin.jvm.internal.i.e(database, "database");
        this.f20092a = database;
        this.f20093b = new AtomicBoolean(false);
        this.f20094c = kotlin.a.a(new Ia.a<p285x2.f>() { // from class: androidx.room.SharedSQLiteStatement$stmt$2
            {
                super(0);
            }

            @Override // Ia.a
            public final p285x2.f invoke() {
                return this.this$0.b();
            }
        });
    }

    public final p285x2.f a() {
        this.f20092a.a();
        return this.f20093b.compareAndSet(false, true) ? (p285x2.f) this.f20094c.getValue() : b();
    }

    public final p285x2.f b() {
        String strC = c();
        RoomDatabase roomDatabase = this.f20092a;
        roomDatabase.getClass();
        roomDatabase.a();
        roomDatabase.b();
        return roomDatabase.g().b0().u(strC);
    }

    public abstract String c();

    public final void d(p285x2.f statement) {
        kotlin.jvm.internal.i.e(statement, "statement");
        if (statement == ((p285x2.f) this.f20094c.getValue())) {
            this.f20093b.set(false);
        }
    }
}
