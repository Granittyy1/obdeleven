package com.voltasit.obdeleven.presentation.dialogs.backup;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: MultiBackupDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiBackupDialog f32189a;

    public g(MultiBackupDialog multiBackupDialog) {
        this.f32189a = multiBackupDialog;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Object then(Task task) {
        MultiBackupDialog multiBackupDialog = this.f32189a;
        multiBackupDialog.f33984s.f2129y.setVisibility(8);
        multiBackupDialog.f33988w.getButton(-1).setEnabled(true);
        return null;
    }
}
