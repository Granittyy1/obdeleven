package p134k8;

import O.e;
import com.obdeleven.service.enums.ApplicationProtocol;
import com.obdeleven.service.exception.CommandException;
import com.obdeleven.service.protocol.Protocol;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import p109i8.k;

/* JADX INFO: renamed from: k8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: BluetoothRequestProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2598c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Protocol f42739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ApplicationProtocol f42740b;

    @Override // p109i8.k
    public final void a(ApplicationProtocol applicationProtocol) {
        this.f42740b = applicationProtocol;
    }

    @Override // p109i8.k
    public final Task<String> b(String str) {
        Task<String> taskE = e(0, str);
        try {
            taskE.waitForCompletion();
        } catch (InterruptedException e10) {
            e.m(e10);
        }
        return taskE;
    }

    @Override // p109i8.k
    public final void c(Protocol protocol) {
        this.f42739a = protocol;
    }

    @Override // p109i8.k
    public final Task<String> d(String str) {
        return e(0, str);
    }

    public final Task e(final int i10, final String str) {
        return (this.f42739a == null || !this.f42739a.d()) ? Task.forError(new CommandException(-1)) : this.f42739a.g(str).onSuccessTask(new Continuation() { // from class: k8.a
            @Override // com.parse.boltsinternal.Continuation
            public final Object then(Task task) {
                int i11;
                C2598c c2598c = this;
                int iOrdinal = c2598c.f42740b.ordinal();
                if (iOrdinal == 0) {
                    return task;
                }
                if (iOrdinal != 1 && iOrdinal != 2) {
                    return Task.forError(new CommandException(-4));
                }
                String str2 = (String) task.getResult();
                if (Integer.parseInt(str2.substring(0, 2), 16) != 127) {
                    return task;
                }
                int i12 = Integer.parseInt(str2.substring(4, 6), 16);
                return ((i12 == 33 || i12 == 35) && (i11 = i10) < 3) ? Task.delay(1000L).continueWithTask(new C2595b(i11, str, c2598c)) : task;
            }
        });
    }
}
