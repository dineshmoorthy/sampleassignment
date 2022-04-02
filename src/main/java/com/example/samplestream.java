@Document(collection = "group")
@TypeAlias("group")
@NoArgsConstructor
@Data
public class Group extends AuditingEntity {

    @Id
    private String id;
    @Details(name = "Group")
    @NotBlank(message="random_usermanagement_group_name_required")
    @Pattern(regexp = "^[a-z0-9_-]{8,64}$", message = "random_usermanagement_group_invalidName")
    private String name;
    @Details(name = "Blocked")
    private boolean blocked;
    @Details(name = "Description")
    @Size(max = 512, message ="random_usermanagement_group_notes_valid")
    private String notes;
    @DBRef
    private List<User> users;

    private Set<String> systemPermissions;

    List<DomainPermission> domainPermissions;

    List<NEPermission> nePermissions;
}

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


// to collect getid from Group object into a list in one single line
 	List<Group> groups = groupRepository.findAll(QueryBuilder.query(filter, Group.class), PagingUtil.createSort(null, GROUP_DEFAULT_SORT));
   	return groups.stream().map(Group::getId).collect(Collectors.toList());

// changing from list of string to list of users
 public Group pushUsersInGroup(Group group, List<String> userIds) {
        List<User> users = userIds.stream().map(id -> {
            User u = new User();
            u.setId(id);
            return u;
        }).collect(Collectors.toList());

	 // remove from group if that keyid is present in single line
    public Group popUsersFromGroup(Group group, List<String> userIds) {
        group.getUsers().removeIf(user -> userIds.contains(user.getId()));
        return group;
    }
	// remove the 	 
	private List<User> usersInEditMode() { 
	List<Group> groups = this.findGroupsByUserId(loggedInUser.getId(), false);
        Map<String, User> userNameMap = groups.stream().flatMap(group -> group.getUsers().stream()).collect(Collectors.toMap(User::getName, u -> u, (u1, u2) -> u1));
        return userNameMap.values().stream().collect(Collectors.toList());
	
	// filter a group using stream.  then check isnotempty.... get next domainpermission 
	List<Group> selectedUserGroups = this.findGroupsByUserId(loggedInUser.getId(), false);
        Set<String> selectedDomainIds = selectedUserGroups.stream().filter(group -> CollectionUtils.isNotEmpty(group.getDomainPermissions()))
                   .flatMap(grp -> grp.getDomainPermissions().stream()).map(d -> d.getDomainId().getId())
                    .collect(Collectors.toSet());
		
 }
// reverse order in single line
editedDomainPerm
	.values()
	.stream()
	.sorted(Comparator.comparing(d -> d.getDomainId().getName(), Comparator.reverseOrder()))
	.collect(Collectors.toList());
	 
	 
	 Map<String, NEPermission> selectNepermissions = new HashMap<>();
        if (CollectionUtils.isNotEmpty(selectedGroup.getNePermissions())) {

            selectNepermissions = selectedGroup.getNePermissions().stream()
                    .collect(Collectors.toMap(n -> n.getNeInfo().getId(), n -> n, (n1, n2) -> n1));
        }
	 
	 
	 
	 
// simple stream use case
		Animal ani1 = new Animal();
		ani1.setName("Rabbit");
		ani1.setColor("white");
		ani1.setPrice(50);
		
		Animal ani2 = new Animal();
		ani2.setName("Rabbit");
		ani2.setColor("black");
		ani2.setPrice(200);
		
		Animal ani3 = new Animal();
		ani3.setName("Rabbit");
		ani3.setColor("grey");
		ani3.setPrice(500);
		
		Animal ani4 = new Animal();
		ani4.setName("tiger");
		ani4.setColor("white");
		ani4.setPrice(4000);
		
		Animal ani5 = new Animal();
		ani5.setName("tiger");
		ani5.setColor("black");
		ani5.setPrice(5000);
		
		List<Animal> animallist = new ArrayList<>();
		animallist.add(ani1);
		animallist.add(ani2);
		animallist.add(ani3);
		animallist.add(ani4);
		animallist.add(ani5);
		
		animallist.stream().filter(o -> o.getColor().equalsIgnoreCase("white")).forEach( pp -> System.out.println(pp.getName()));
		animallist.stream().filter(o -> o.getColor().equalsIgnoreCase("white")).forEachOrdered( pp -> System.out.println(pp.getName()));
		List<String> namelist = animallist.stream().map(Animal::getName).collect(Collectors.toList());		 
