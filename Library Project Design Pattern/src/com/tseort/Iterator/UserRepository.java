package com.tseort.Iterator;

import com.tseort.UserFactory.IUser;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Container {

    public List<IUser> users = new ArrayList<IUser>();

    @Override
    public Iterator getIterator() {
        return new UserIterator();
    }

    public void addUser(IUser user) {
        users.add(user);
    }

    private class UserIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < users.size()) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return users.get(index++);
            }
            return null;
        }
    }
}
