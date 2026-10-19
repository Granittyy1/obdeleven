package androidx.datastore.core;

import Ia.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import me.zhanghai.android.materialprogressbar.R;
import p293xa.r;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements p<Object, kotlin.coroutines.c<Object>, Object> {
    final /* synthetic */ List<Ia.l<kotlin.coroutines.c<? super r>, Object>> $cleanUps;
    final /* synthetic */ List<c<Object>> $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends c<Object>> list, List<Ia.l<kotlin.coroutines.c<? super r>, Object>> list2, kotlin.coroutines.c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // Ia.p
    public final Object invoke(Object obj, kotlin.coroutines.c<Object> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, cVar)).invokeSuspend(r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f43038b
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r8.L$1
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r8.L$0
            java.util.List r4 = (java.util.List) r4
            kotlin.b.b(r9)
            goto L44
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r1 = r8.L$3
            java.lang.Object r4 = r8.L$2
            androidx.datastore.core.c r4 = (androidx.datastore.core.c) r4
            java.lang.Object r5 = r8.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r8.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.b.b(r9)
            r7 = r6
            r6 = r4
            r4 = r7
            goto L66
        L35:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.L$0
            java.util.List<androidx.datastore.core.c<java.lang.Object>> r1 = r8.$migrations
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List<Ia.l<kotlin.coroutines.c<? super xa.r>, java.lang.Object>> r4 = r8.$cleanUps
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r1.next()
            androidx.datastore.core.c r5 = (androidx.datastore.core.c) r5
            r8.L$0 = r4
            r8.L$1 = r1
            r8.L$2 = r5
            r8.L$3 = r9
            r8.label = r3
            java.lang.Object r6 = r5.b()
            if (r6 != r0) goto L61
            return r0
        L61:
            r7 = r1
            r1 = r9
            r9 = r6
            r6 = r5
            r5 = r7
        L66:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1 r9 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1
            r1 = 0
            r9.<init>(r6, r1)
            r4.add(r9)
            r8.L$0 = r4
            r8.L$1 = r5
            r8.L$2 = r1
            r8.L$3 = r1
            r8.label = r2
            java.lang.Object r9 = r6.a()
            if (r9 != r0) goto L88
            return r0
        L88:
            r1 = r5
            goto L44
        L8a:
            r9 = r1
            goto L88
        L8c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
