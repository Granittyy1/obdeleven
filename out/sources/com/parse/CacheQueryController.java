package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;
import java.util.concurrent.Callable;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class CacheQueryController extends AbstractQueryController {
    private final NetworkQueryController networkController;

    /* JADX INFO: renamed from: com.parse.CacheQueryController$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$parse$ParseQuery$CachePolicy;

        static {
            int[] iArr = new int[ParseQuery.CachePolicy.values().length];
            $SwitchMap$com$parse$ParseQuery$CachePolicy = iArr;
            try {
                iArr[ParseQuery.CachePolicy.IGNORE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$parse$ParseQuery$CachePolicy[ParseQuery.CachePolicy.NETWORK_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$parse$ParseQuery$CachePolicy[ParseQuery.CachePolicy.CACHE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$parse$ParseQuery$CachePolicy[ParseQuery.CachePolicy.CACHE_ELSE_NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$parse$ParseQuery$CachePolicy[ParseQuery.CachePolicy.NETWORK_ELSE_CACHE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$parse$ParseQuery$CachePolicy[ParseQuery.CachePolicy.CACHE_THEN_NETWORK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public interface CommandDelegate<T> {
        Task<T> runFromCacheAsync();

        Task<T> runOnNetworkAsync();
    }

    public CacheQueryController(NetworkQueryController networkQueryController) {
        this.networkController = networkQueryController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ParseObject> Task<List<T>> findFromCacheAsync(final ParseQuery.State<T> state, String str) {
        final String cacheKey = ParseRESTQueryCommand.findCommand(state, str).getCacheKey();
        return Task.call(new Callable<List<T>>() { // from class: com.parse.CacheQueryController.3
            @Override // java.util.concurrent.Callable
            public List<T> call() throws Exception {
                JSONObject jSONObjectJsonFromKeyValueCache = ParseKeyValueCache.jsonFromKeyValueCache(cacheKey, state.maxCacheAge());
                if (jSONObjectJsonFromKeyValueCache == null) {
                    throw new ParseException(R.styleable.AppCompatTheme_windowFixedHeightMajor, "results not cached");
                }
                try {
                    return CacheQueryController.this.networkController.convertFindResponse(state, jSONObjectJsonFromKeyValueCache);
                } catch (JSONException unused) {
                    throw new ParseException(R.styleable.AppCompatTheme_windowFixedHeightMajor, "the cache contains corrupted json");
                }
            }
        }, Task.BACKGROUND_EXECUTOR);
    }

    private <TResult> Task<TResult> runCommandWithPolicyAsync(final CommandDelegate<TResult> commandDelegate, ParseQuery.CachePolicy cachePolicy) {
        switch (AnonymousClass7.$SwitchMap$com$parse$ParseQuery$CachePolicy[cachePolicy.ordinal()]) {
            case 1:
            case 2:
                return commandDelegate.runOnNetworkAsync();
            case 3:
                return commandDelegate.runFromCacheAsync();
            case 4:
                return (Task<TResult>) commandDelegate.runFromCacheAsync().continueWithTask(new Continuation<TResult, Task<TResult>>() { // from class: com.parse.CacheQueryController.5
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<TResult> then(Task<TResult> task) {
                        return task.getError() instanceof ParseException ? commandDelegate.runOnNetworkAsync() : task;
                    }
                });
            case 5:
                return (Task<TResult>) commandDelegate.runOnNetworkAsync().continueWithTask(new Continuation<TResult, Task<TResult>>() { // from class: com.parse.CacheQueryController.6
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<TResult> then(Task<TResult> task) {
                        Exception error = task.getError();
                        return ((error instanceof ParseException) && ((ParseException) error).getCode() == 100) ? commandDelegate.runFromCacheAsync() : task;
                    }
                });
            case 6:
                throw new RuntimeException("You cannot use the cache policy CACHE_THEN_NETWORK with find()");
            default:
                throw new RuntimeException("Unknown cache policy: " + cachePolicy);
        }
    }

    @Override // com.parse.ParseQueryController
    public <T extends ParseObject> Task<List<T>> findAsync(final ParseQuery.State<T> state, ParseUser parseUser, final Task<Void> task) {
        final String sessionToken = parseUser != null ? parseUser.getSessionToken() : null;
        return runCommandWithPolicyAsync(new CommandDelegate<List<T>>() { // from class: com.parse.CacheQueryController.1
            @Override // com.parse.CacheQueryController.CommandDelegate
            public Task<List<T>> runFromCacheAsync() {
                return CacheQueryController.this.findFromCacheAsync(state, sessionToken);
            }

            @Override // com.parse.CacheQueryController.CommandDelegate
            public Task<List<T>> runOnNetworkAsync() {
                return CacheQueryController.this.networkController.findAsync(state, sessionToken, task);
            }
        }, state.cachePolicy());
    }
}
