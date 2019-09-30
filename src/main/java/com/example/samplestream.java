 @SuppressWarnings("PMD.DataflowAnomalyAnalysis")

       public int getItemId(Map<String, WirelineCartItem> itemInfoMap) {

              int itemId;

              if (RestClientConstants.DEV_ENV.equals(env) || RestClientConstants.CI_ENV.equals(env)) {

                     itemId = (int) atomicLong.incrementAndGet();

              } else {

                     if (Optional.of(itemInfoMap).isPresent() && !itemInfoMap.isEmpty()) {

                           Stream<Entry<String, WirelineCartItem>> stringStream = itemInfoMap.entrySet().stream();

 

                           Entry<String, WirelineCartItem> maxCartItem = stringStream.reduce((cartItem1,

                                         cartItem2) -> Integer.valueOf(cartItem1.getValue().getItemId()) >

                                         Integer.valueOf(cartItem2.getValue().getItemId())

                                                       ? cartItem1 : cartItem2)

                                         .get();

                           itemId = Integer.valueOf(maxCartItem.getValue().getItemId()) + 1;

                     }else{

                           itemId = 1;

                     }

 

              }
        
        
        
        // sample map to list using stream api
           @Override
    public List<User> findAllLoggedInUsers() {
        User loggedInUser = this.findLoggedInUser();
        if (loggedInUser.getUserType().getRole().equalsIgnoreCase(UserType.ADMIN.getRole())) {
            return userRepository.findAll();
        } else {
            List<Group> groups = groupService.findGroupsByUserId(loggedInUser.getId());
            Map<String, User> userNameMap = new HashMap<>();
            for (Group group : groups) {
                //  group.getUsers().stream().collect(Collectors.toMap(User::getName, user -> user));
            	// if the username is there not to  do anything
            	// if the user is not there we have to add it
                for (User user : group.getUsers()) {
                    if (!userNameMap.containsKey(user.getName())) {
                        userNameMap.put(user.getName(), user);
                    }
                }
            }
            return userNameMap.values().stream().collect(Collectors.toList());
        }
    }
        
        
        
        
		Map<String, ManagedObject> n = c.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.comparing(ManagedObject::getIndex)))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (x, y) -> {
					throw new AssertionError();
				}, LinkedHashMap::new));


              return itemId;

       }
