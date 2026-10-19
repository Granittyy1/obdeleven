package com.parse;

import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
interface ParseSessionController {
    Task<ParseObject.State> getSessionAsync(String str);

    Task<Void> revokeAsync(String str);
}
