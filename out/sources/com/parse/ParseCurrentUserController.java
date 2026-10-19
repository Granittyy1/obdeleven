package com.parse;

import com.parse.boltsinternal.Task;

/* JADX INFO: loaded from: classes3.dex */
interface ParseCurrentUserController extends ParseObjectCurrentController<ParseUser> {
    Task<ParseUser> getAsync(boolean z10);

    Task<String> getCurrentSessionTokenAsync();

    Task<Void> logOutAsync();

    Task<Void> setIfNeededAsync(ParseUser parseUser);
}
