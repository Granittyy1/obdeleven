package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class NetworkObjectController implements ParseObjectController {
    private ParseHttpClient client;
    private ParseObjectCoder coder = ParseObjectCoder.get();

    public NetworkObjectController(ParseHttpClient parseHttpClient) {
        this.client = parseHttpClient;
    }

    @Override // com.parse.ParseObjectController
    public Task<Void> deleteAsync(ParseObject.State state, String str) {
        return ParseRESTObjectCommand.deleteObjectCommand(state, str).executeAsync(this.client).makeVoid();
    }

    @Override // com.parse.ParseObjectController
    public Task<ParseObject.State> fetchAsync(final ParseObject.State state, String str, final ParseDecoder parseDecoder) {
        return ParseRESTObjectCommand.getObjectCommand(state.objectId(), state.className(), str).executeAsync(this.client).onSuccess(new Continuation<JSONObject, ParseObject.State>() { // from class: com.parse.NetworkObjectController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseObject.State then(Task<JSONObject> task) {
                JSONObject result = task.getResult();
                return NetworkObjectController.this.coder.decode(state.newBuilder().clear(), result, parseDecoder).isComplete(true).build();
            }
        });
    }

    @Override // com.parse.ParseObjectController
    public List<Task<ParseObject.State>> saveAllAsync(List<ParseObject.State> list, List<ParseOperationSet> list2, String str, List<ParseDecoder> list3) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        PointerEncoder pointerEncoder = PointerEncoder.get();
        for (int i10 = 0; i10 < size; i10++) {
            ParseObject.State state = list.get(i10);
            arrayList.add(ParseRESTObjectCommand.saveObjectCommand(state, this.coder.encode(state, list2.get(i10), pointerEncoder), str));
        }
        List<Task<JSONObject>> listExecuteBatch = ParseRESTObjectBatchCommand.executeBatch(this.client, arrayList, str);
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            final ParseObject.State state2 = list.get(i11);
            final ParseDecoder parseDecoder = list3.get(i11);
            arrayList2.add(listExecuteBatch.get(i11).onSuccess(new Continuation<JSONObject, ParseObject.State>() { // from class: com.parse.NetworkObjectController.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public ParseObject.State then(Task<JSONObject> task) {
                    JSONObject result = task.getResult();
                    return NetworkObjectController.this.coder.decode(state2.newBuilder().clear(), result, parseDecoder).isComplete(false).build();
                }
            }));
        }
        return arrayList2;
    }

    @Override // com.parse.ParseObjectController
    public Task<ParseObject.State> saveAsync(final ParseObject.State state, ParseOperationSet parseOperationSet, String str, final ParseDecoder parseDecoder) {
        return ParseRESTObjectCommand.saveObjectCommand(state, this.coder.encode(state, parseOperationSet, PointerEncoder.get()), str).executeAsync(this.client).onSuccess(new Continuation<JSONObject, ParseObject.State>() { // from class: com.parse.NetworkObjectController.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseObject.State then(Task<JSONObject> task) {
                JSONObject result = task.getResult();
                return NetworkObjectController.this.coder.decode(state.newBuilder().clear(), result, parseDecoder).isComplete(false).build();
            }
        });
    }
}
