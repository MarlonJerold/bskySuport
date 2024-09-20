package org.wms.wms;

import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import org.bluesky.client.BskyAgent;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("threadBean")
@ViewScoped
public class ThreadBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private List<String> threads = new ArrayList<>();
    private String postContent;
    private String editorText;

    public ThreadBean() {
        threads.add("");
    }

    public List<String> getThreads() {
        return threads;
    }

    public void setThreads(List<String> threads) {
        this.threads = threads;
    }

    public String getPostContent() {
        return postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public String getEditorText() {
        return editorText;
    }

    public void setEditorText(String editorText) {
        this.editorText = editorText;
    }

    public void addThread() {
        threads.add("");
    }

    public void removeThread(int index) {
        if (index >= 0 && index < threads.size()) {
            threads.remove(index);
        }
    }

    public void handleSubmit() throws IOException {
        BskyAgent agent = new BskyAgent("patinho.tech", "");
        agent.createPost(editorText);
    }
}