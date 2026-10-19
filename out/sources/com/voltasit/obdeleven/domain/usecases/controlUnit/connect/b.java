package com.voltasit.obdeleven.domain.usecases.controlUnit.connect;

import com.obdeleven.service.exception.CommandException;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30675a;

    public /* synthetic */ b(int i10) {
        this.f30675a = i10;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) throws CommandException {
        switch (this.f30675a) {
            case 0:
                return new com.obdeleven.service.core.gen1.a().a();
            case 1:
                return Boolean.TRUE;
            default:
                String str = (String) task.getResult();
                if (str.startsWith("71")) {
                    return null;
                }
                if (str.startsWith("7F31")) {
                    throw new CommandException(Integer.parseInt(str.substring(4, 6), 16));
                }
                throw new CommandException(-1);
        }
    }
}
